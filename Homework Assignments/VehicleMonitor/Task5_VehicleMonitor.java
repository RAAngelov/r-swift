import java.util.Scanner;

public class Task5_VehicleMonitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double F = sc.nextDouble();
		VehicleMonitor[] V = new VehicleMonitor[N];
		sc.nextLine();
		int[] distances = new int[5];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			String[] str1 = str.split(",");
			if (str1.length == 6) {
				V[i] = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]));
				distances[i] = Integer.parseInt(str1[5]);

			} else if (str1.length == 7) {
				V[i] = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]), Integer.parseInt(str1[6]));
				distances[i] = Integer.parseInt(str1[5]);
			} else if (str1.length == 8) {
				V[i] = new VehicleMonitor(str1[0], str1[1],
						Integer.parseInt(str1[2]), Float.parseFloat(str1[3]),
						Integer.parseInt(str1[4]), Integer.parseInt(str1[5]),
						str1[7]);
				distances[i] = Integer.parseInt(str1[5]);
			}

		}
		for (int i = 0; i < N; i++) {
			V[i].getDescription(F, distances[i]);
		}

	}

}
