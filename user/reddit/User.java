package user.reddit;

public class User {
	private String name;

	public User(String name) {
		if ((name == null) || (name.equals(""))) {
			System.out.println("Emptry name passed");
			this.name = "anonymous";
			return;
		}
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
