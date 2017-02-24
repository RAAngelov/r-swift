import java.util.Arrays;
import java.util.Scanner;

public class Task4_EmployeeSalarySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		Employee[] Emps = new Employee[N];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			String[] str1 = str.split(",");
			if (str1.length == 4) {
				Emps[i] = new Employee(str1[0], Float.parseFloat(str1[1]),
						str1[2], str1[3]);
			} else if (str1.length == 5) {
				Emps[i] = new Employee(str1[0], Float.parseFloat(str1[1]),
						str1[2], str1[3], Integer.parseInt(str1[4]));
			} else if (str1.length == 6) {
				Emps[i] = new Employee(str1[0], Float.parseFloat(str1[1]),
						str1[2], str1[3], Integer.parseInt(str1[4]), str1[5]);

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Emps[j].getSalary() < Emps[i].getSalary()) {
					Employee temp = Emps[i];
					Emps[i] = Emps[j];
					Emps[j] = temp;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Emps[i].getDescription());
		}

	}
}
