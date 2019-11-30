import java.util.ArrayList;

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

}
