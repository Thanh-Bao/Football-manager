
public class Player {
	private String id;
	private String name;
	private String position;

	public Player(String id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		return "ID:" + id + " name:" + name + " vị trí:" + position;
	}
}
