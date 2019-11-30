import java.util.ArrayList;
import java.util.HashMap;

public class Award {
	private String name;
	private int year;
	private Team goldCup;
	private Team sliverCup;
	private Team copperCup;
	private ArrayList<FootballMatch> matchList;

	public Award(String name, int year, Team goldCup, Team sliverCup, Team copperCup,
			ArrayList<FootballMatch> matchList) {
		this.name = name;
		this.year = year;
		this.goldCup = goldCup;
		this.sliverCup = sliverCup;
		this.copperCup = copperCup;
		this.matchList = matchList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Team getGoldCup() {
		return goldCup;
	}

	public void setGoldCup(Team goldCup) {
		this.goldCup = goldCup;
	}

	public Team getSliverCup() {
		return sliverCup;
	}

	public void setSliverCup(Team sliverCup) {
		this.sliverCup = sliverCup;
	}

	public Team getCopperCup() {
		return copperCup;
	}

	public void setCopperCup(Team copperCup) {
		this.copperCup = copperCup;
	}

	public ArrayList<FootballMatch> getMatchList() {
		return matchList;
	}

	public void setMatchList(ArrayList<FootballMatch> matchList) {
		this.matchList = matchList;
	}

	public HashMap<Player, Integer> staticPlayer_PlayTime() {
		HashMap<Player, Integer> result = new HashMap<Player, Integer>();
		for (FootballMatch match : matchList) {
			for (Player pl : match.getAllPlayer()) {
				if (result.containsKey(pl)) {
					int newTime = result.get(pl) + 1;
					result.put(pl, newTime);
				} else {
					result.put(pl, 1);
				}
			}
		}
		return result;
	}

	public HashMap<Player, Integer> staticPlayer_winScore() {
		HashMap<Player, Integer> result = new HashMap<Player, Integer>();
		for (FootballMatch match : matchList) {
			match.getWinMap().forEach((k, v) -> {
				if (result.containsKey(k)) {
					int newScore = result.get(k) + match.getWinMap().get(k);
					result.put(k, newScore);
				} else {
					result.put(k, match.getWinMap().get(k));
				}
			});
		}
		return result;
	}

	public int winScoreTeam(Team t) {
		int result = 0;
		for (FootballMatch match : matchList) {
			if (match.getTeamWin().equals(t)) {
				result++;
			}
		}
		return result;
	}

	public HashMap<Player, Integer> bestPlayer() {
		HashMap<Player, Integer> output = new HashMap<Player, Integer>();
		Player theBest = null;
		int scoreMax = 0;
		for (Player pl : staticPlayer_winScore().keySet()) {
			if (staticPlayer_winScore().get(pl) > scoreMax) {
				theBest = pl;
				scoreMax = staticPlayer_winScore().get(pl);
			}
		}
		output.put(theBest, scoreMax);
		for (Player pl : staticPlayer_winScore().keySet()) {
			if (staticPlayer_winScore().get(pl) == scoreMax) {
				output.put(pl, scoreMax);
			}
		}

		return output;

	}
}
