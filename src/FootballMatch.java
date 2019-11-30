import java.util.ArrayList;
import java.util.HashMap;

public class FootballMatch {
	private ArrayList<Player> teamA;
	private ArrayList<Player> teamB;
	private Team teamWin;
	private int scoreA;
	private int scoreB;
	private HashMap<Player, Integer> winMap;

	public FootballMatch(ArrayList<Player> teamA, ArrayList<Player> teamB, Team teamWin, int scoreA, int scoreB,
			HashMap<Player, Integer> winMap) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.teamWin = teamWin;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
		this.winMap = winMap;
	}

	public ArrayList<Player> getTeamA() {
		return teamA;
	}

	public void setTeamA(ArrayList<Player> teamA) {
		this.teamA = teamA;
	}

	public ArrayList<Player> getTeamB() {
		return teamB;
	}

	public void setTeamB(ArrayList<Player> teamB) {
		this.teamB = teamB;
	}

	public Team getTeamWin() {
		return teamWin;
	}

	public void setTeamWin(Team teamWin) {
		this.teamWin = teamWin;
	}

	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}

	public int getScoreB() {
		return scoreB;
	}

	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}

	public HashMap<Player, Integer> getWinMap() {
		return winMap;
	}

	public void setWinMap(HashMap<Player, Integer> winMap) {
		this.winMap = winMap;
	}

	public ArrayList<Player> getAllPlayer() {
		ArrayList<Player> output = new ArrayList<Player>();
		output.addAll(teamA);
		output.addAll(teamB);
		return output;
	}

}
