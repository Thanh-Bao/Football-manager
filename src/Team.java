import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> listOfPlayers;
	private String coachName;

	public Team(String name, ArrayList<Player> listOfPlayers, String coachName) {
		this.name = name;
		this.listOfPlayers = listOfPlayers;
		this.coachName = coachName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getListOfPlayers() {
		return listOfPlayers;
	}

	public void setListOfPlayers(ArrayList<Player> listOfPlayers) {
		this.listOfPlayers = listOfPlayers;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String toString() {
		return "Team:" + name + "list:" + listOfPlayers + "manager:" + coachName;
	}
}
