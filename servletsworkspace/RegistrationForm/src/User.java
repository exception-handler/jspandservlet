
public class User {

	String emailId;
	String name;
	String password;
	String gender;
	int age;


	public User(String emailId, String name, String password, String gender, int age) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
	
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", name=" + name + ", password=" + password + ", gender=" + gender
				+ ", age=" + age + "]\n";
	}

	public User() {
		super();
	}

}
