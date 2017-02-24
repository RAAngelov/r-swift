public class Employee {
	String name;
	float salary;
	String position;
	String department;
	int age;
	String email;

	Employee(String name, float salary, String position, String department) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = 0;
		this.email = "";
	}

	Employee(String name, float salary, String position, String department,
			int age) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
		this.email = "";
	}

	Employee(String name, float salary, String position, String department,
			int age, String email) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public String getDescription() {
		if (email == "") {
			return (name + "," + department + "," + position);
		} else {
			return (name + "," + department + "," + position + "," + email);
		}

	}

}
