import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	private static void printMapWrap(HashMap<Player, Integer> map) {
		for (Player pl : map.keySet()) {
			System.out.println(pl + " --> " + map.get(pl));
		}
	}

	public static void main(String[] args) {
		////////// for Player
		Player player11 = new Player("A1", "Quang Hải", "tiền đạo");
		Player player12 = new Player("A2", "Tiến Dũng", "Thủ môn");

		Player player21 = new Player("B1", "Xuân Trường", "Hậu vệ");
		Player player22 = new Player("B2", "Ronaldo", "Tiền đạo");

		Player player31 = new Player("C1", "Messi", "Trung Vệ");
		Player player32 = new Player("C2", "neymar", "Tiền Vệ");

/////// for team
		ArrayList<Player> listTeam1 = new ArrayList<Player>();
		listTeam1.add(player11);
		listTeam1.add(player12);

		ArrayList<Player> listTeam2 = new ArrayList<Player>();
		listTeam2.add(player21);
		listTeam2.add(player22);

		ArrayList<Player> listTeam3 = new ArrayList<Player>();
		listTeam3.add(player31);
		listTeam3.add(player32);

		Team team1 = new Team("team1", listTeam1, "Park HangSeo");
		Team team2 = new Team("team2", listTeam2, "Lý Mạc Sầu");
		Team team3 = new Team("team3", listTeam3, "Vô Danh");
///////  for footballMatch
		HashMap<Player, Integer> dsWinMapI = new HashMap<Player, Integer>();
		dsWinMapI.put(player11, 5);
		HashMap<Player, Integer> dsWinMapII = new HashMap<Player, Integer>();
		dsWinMapII.put(player21, 8);
		dsWinMapII.put(player22, 5);
		HashMap<Player, Integer> dsWinMapIII = new HashMap<Player, Integer>();
		dsWinMapIII.put(player31, 4);
		dsWinMapIII.put(player11, 3);

		FootballMatch footballMathI = new FootballMatch(listTeam1, listTeam2, team1, 3, 0, dsWinMapI);
		FootballMatch footballMatchII = new FootballMatch(listTeam2, listTeam3, team2, 6, 0, dsWinMapII);
		FootballMatch footballMatchIII = new FootballMatch(listTeam1, listTeam3, team1, 4, 3, dsWinMapIII);
////// for Award
		ArrayList<FootballMatch> matchListFinal = new ArrayList<FootballMatch>();
		matchListFinal.add(footballMathI);
		matchListFinal.add(footballMatchII);
		matchListFinal.add(footballMatchIII);

		Award ketqua = new Award("word Cup", 2022, team1, team2, team3, matchListFinal);

		/// test method

		System.out.println("______CẦU THỦ CÓ SỐ BÀN THẮNG NHIỀU NHẤT_______ ");
		printMapWrap(ketqua.bestPlayer());
		System.out.println();
		System.out.println("______TỔNG BÀN THẮNG CỦA TEAM1__________");
		System.out.println(ketqua.winScoreTeam(team1));
		System.out.println();
		System.out.println("______THỐNG KÊ CẦU THỦ GHI BÀN__________");
		printMapWrap(ketqua.staticPlayer_winScore());
		System.out.println();
		System.out.println("______THỐNG KÊ SỐ LẦN RA SÂN__________");
		printMapWrap(ketqua.staticPlayer_PlayTime());
	}
}
