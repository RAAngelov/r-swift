import java.util.Scanner;

public class Task5_VehicleMonitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double F = sc.nextDouble();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			String[] str1 = str.split(",");
			if (str1.length == 6) {
				VehicleMonitor V = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]));
				V.getDescription(F, Integer.parseInt(str1[5]));

			} else if (str1.length == 7) {
				VehicleMonitor V = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]), Integer.parseInt(str1[6]));
				V.getDescription(F, Integer.parseInt(str1[5]));
			} else if (str1.length == 8) {
				VehicleMonitor V = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]), Integer.parseInt(str1[5]),
						str1[7]);
				V.getDescription(F, Integer.parseInt(str1[5]));
			}

		}

	}

}
