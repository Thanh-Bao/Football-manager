import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Player player11 = new Player("A1", "Quang Hải", "tiền đạo");
		Player player12 = new Player("A2", "Tiến Dũng", "Thủ môn");
		Player player21 = new Player("B1", "Xuân Trường", "Hậu vệ");
		Player player22 = new Player("B2", "Ronaldo", "Tiền đạo");
		Player player31 = new Player("C1", "Messi", "Trung Vệ");
		Player player32 = new Player("C2", "Donal Trump", "Tiền Vệ");

		ArrayList<Player> listTeam1 = new ArrayList<Player>();
		listTeam1.add(player11);
		listTeam1.add(player12);
/////// for team
		ArrayList<Player> listTeam2 = new ArrayList<Player>();
		listTeam1.add(player21);
		listTeam1.add(player22);
		ArrayList<Player> listTeam3 = new ArrayList<Player>();
		listTeam1.add(player31);
		listTeam1.add(player32);

		Team team1 = new Team("team1", listTeam1, "Park HangSeo");
		Team team2 = new Team("team2", listTeam1, "Lý Mạc Sầu");
		Team team3 = new Team("team3", listTeam3, "Vô Danh");
///////  for footballMatch
		HashMap<Player, Integer> dsWinMapI = new HashMap<Player, Integer>();
		dsWinMapI.put(player11, 3);
		HashMap<Player, Integer> dsWinMapII = new HashMap<Player, Integer>();
		dsWinMapII.put(player21, 1);
		dsWinMapII.put(player22, 5);
		HashMap<Player, Integer> dsWinMapIII = new HashMap<Player, Integer>();
		dsWinMapIII.put(player31, 4);
		dsWinMapIII.put(player11, 3);

		FootballMatch footballMathI = new FootballMatch(listTeam1, listTeam2, team1, 3, 0, dsWinMapI);
		FootballMatch footballMathII = new FootballMatch(listTeam2, listTeam2, team2, 6, 0, dsWinMapII);
		FootballMatch footballMathIII = new FootballMatch(listTeam1, listTeam3, team3, 4, 3, dsWinMapIII);
////// for Award
		ArrayList<FootballMatch> mathListFinal = new ArrayList<FootballMatch>();
		mathListFinal.add(footballMathI);
		mathListFinal.add(footballMathII);
		mathListFinal.add(footballMathIII);
	}
}
