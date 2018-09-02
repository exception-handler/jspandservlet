package p1;

public class User {

	String username;
	int experience;
	int currentsalary;
	int expectedsalary;
	String skill;

	public User(String username, int experience, int currentsalary, int expectedsalary, String skill) {
		super();
		this.username = username;
		this.experience = experience;
		this.currentsalary = currentsalary;
		this.expectedsalary = expectedsalary;
		this.skill = skill;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getCurrentsalary() {
		return currentsalary;
	}

	public void setCurrentsalary(int currentsalary) {
		this.currentsalary = currentsalary;
	}

	public int getExpectedsalary() {
		return expectedsalary;
	}

	public void setExpectedsalary(int expectedsalary) {
		this.expectedsalary = expectedsalary;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", experience=" + experience + ", currentsalary=" + currentsalary
				+ ", expectedsalary=" + expectedsalary + ", skill=" + skill + "]";
	}
	
	public boolean validateUser()throws Exception 
	{
		if(experience<=2)
		{
			
			 throw new Exception("Invalid User exp");
		 
		}
		if(experience>2) return true;
		else return false;
	}
	

}
