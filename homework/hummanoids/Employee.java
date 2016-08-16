package homework.hummanoids;

public class Employee extends Person{
	private static final int HOURS_IN_DAY = 24;
	private static final float OVERRTIME_COEFICIENT = 1.5F;

	private float daySalary;

	private Employee(String name, int age, Gender isMele) {
		super(name, age, isMele);
	}

	Employee(float daySalary, String name, int age, Gender isMele) {
		this(name, age, isMele);

		if (daySalary <= 0) {
			System.out.println("Day Salary must be positive");
			return;
		} else {
			this.daySalary = daySalary;
		}
	}

	double calculateOverrtime(double hours) {
		float hourSalaryInOverrtime;

		if (super.age < 18) {
			hourSalaryInOverrtime = 0;
			return 0;
		} else {
			hourSalaryInOverrtime = (float) ((this.daySalary / HOURS_IN_DAY) * OVERRTIME_COEFICIENT);

			/*
			 * Ne znam dali trqbva da dobavqm overrtime vremeto v zaplatata, no
			 * go napravih vupreki tova
			 */

			this.daySalary += (hourSalaryInOverrtime * hours);
			return hourSalaryInOverrtime * hours;
		}
	}

	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day Salary " + this.daySalary);
	}
}
