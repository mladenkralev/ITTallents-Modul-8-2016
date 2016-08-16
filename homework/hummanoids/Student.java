package homework.hummanoids;

public class Student extends Person {
	/*
	 * narochno e napraveno s vtori private, za da se zapazi dobriq stil na
	 * pisane! Moje da se mahne private Student(String name, int age, boolean
	 * isMele) { super(name, age, isMele); }
	 *
	 * i vmesto this(name, age, isMele) da se pishe super(name, age, isMele)
	 */

	private float score;

	private Student(String name, int age, Gender isMele) {
		super(name, age, isMele);
	}

	Student(float score, String name, int age, Gender isMele) {
		this(name, age, isMele);

		if ((score < 2) || (score > 6)) {
			System.out.println("Cant set score to this number");
			this.score = 2;
			return;
		} else {
			this.score = score;
		}
	}

	void showStudenInfo() {
		super.showPersonInfo();
		System.out.println("Score " + this.score);
	}
}
