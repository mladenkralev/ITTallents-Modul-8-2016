package homework.hummanoids;

public class Demo {
	private static byte currentIndex = 0;;
	private static final int OVERRTIME_TEST_TIME = 2;

	public static void main(String[] args) {
		Person[] personArray = new Person[10];

		Student mladen = new Student(3f, "Mladen", 20, Gender.MELE);
		personArray[currentIndex++] = mladen;

		Student niki = new Student(4.0f, "Niki", 29, Gender.MELE);
		personArray[currentIndex++] = niki;

		Person gloria = new Person("Gloria", 20, Gender.FEMELE);
		personArray[currentIndex++] = gloria;

		Person shishmanka = new Person("Shishmanka", 23, Gender.FEMELE);
		personArray[currentIndex++] = shishmanka;

		Employee gosho = new Employee(2000.0f, "Gosho", 15, Gender.MELE);
		personArray[currentIndex++] = gosho;

		Employee kitodar = new Employee(2400.0f, "kitodar", 29, Gender.MELE);
		personArray[currentIndex++] = kitodar;

		for (int index = 0; index < personArray.length; index++) {
			System.out.println();
			if (personArray[index] != null) {
				if (personArray[index] instanceof Student) {
					((Student) personArray[index]).showStudenInfo();
					continue;
				}

				if (personArray[index] instanceof Employee) {
					((Employee) personArray[index]).showEmployeeInfo();
					continue;
				}

				if (personArray[index] instanceof Person) {
					personArray[index].showPersonInfo();
					continue;
				}
			}
		}

		for (int index = 0; index < personArray.length; index++) {
			System.out.println();
			if (personArray[index] != null) {
				if (personArray[index] instanceof Employee) {
					((Employee) personArray[index]).showEmployeeInfo();
					System.out.println("Company onws him "
							+ ((Employee) personArray[index]).calculateOverrtime(OVERRTIME_TEST_TIME));
					continue;
				}
			}

		}
	}
}
