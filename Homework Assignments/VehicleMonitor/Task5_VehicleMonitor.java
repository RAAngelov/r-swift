import java.util.Scanner;


public class Task5_VehicleMonitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double F = sc.nextDouble();
		for (int i = 0;i < N ;i++){
			String str = sc.nextLine();
			String[] str1 = str.split(",");
			if (str1.length == 5) {
				VehicleMonitor V1 = new VehicleMonitor(str1[0],str1[1],Integer.parseInt(str1[2]),Float.parseFloat(str1[3]),Integer.parseInt(str1[4]));
				
			}
			
		}

	}

}
