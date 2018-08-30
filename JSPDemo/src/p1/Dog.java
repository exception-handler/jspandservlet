package p1;

public class Dog {

	String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public String playGames()
	{
		return name+" playing games";
	}
}













