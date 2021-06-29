/**
 * kadai 08-02
 *
 * @author haruna wataru
 * @version 2021-06-10
 */

class Employee {
	int no;
	String name;

	Employee() {
		no = 0;
		name = "No name";
	}

	Employee(int no_, String name_) {
		no = no_;
		name = name_;
	}

	static void description() {
		String description = "This is  Program printing Employee data.";
		System.out.println(description);
	}

	void print() {
		System.out.println("No		: " + no);
		System.out.println("Name	: " + name);
	}

	void changeData(int no_, String name_) {
		no = no_;
		name = name_;
	}
}

class PrintEmp {
	public static void main(String args[]) {

		String HR = "-".repeat(20);

		Employee.description();
		System.out.println(HR);

		Employee emp1 = new Employee(1, "Tanaka");
		emp1.print();
		System.out.println(HR);

		Employee emp2 = new Employee();
		emp2.print();
		System.out.println(HR);

		emp2.changeData(5, "Yamada");
		emp2.print();
		System.out.println(HR);
	}
}
