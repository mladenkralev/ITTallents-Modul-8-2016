package homework.hummanoids;

public class Person {
	protected String name;
	protected int age;
	protected Gender isMele;

	Person(String name, int age, Gender isMele) {
		if ((name == null) || (name.equals(""))) {
			System.out.println("Enter non-emptry name");
			this.name = "Unknowned";
			return;
		} else {
			boolean isValid = true;
			for (int index = 0; index < name.length(); index++) {
				if (Character.isDigit(name.charAt(index))) {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				this.name = name;
			} else {
				System.out.println("Enter name without digits. " + name + " is not valid");
				this.name = "Unknowned";
				return;
			}
		}

		if ((age <= 0) || (age > 150)) {
			System.out.println("Not valid age");
			return;
		} else {
			this.age = age;
		}

		this.isMele = isMele;
	}

	void showPersonInfo() {
		System.out.println("Name " + this.name + "\nAge " + this.age + "\nMele " + this.isMele);
	}
}
