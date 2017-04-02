package Homework_5.OOP_Debugging;

import java.util.Scanner;

public class Task2_CredentialsManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Credentials[] DB = new Credentials[100];
		int credCount = 0;
		String str;
		while (!(str = sc.nextLine()).equalsIgnoreCase("END")) {
			String arr[] = str.split(" ", 4);
			if (arr[0].equals("ENROLL")) {
				DB[credCount++] = new Credentials(arr[1], arr[2]);
				System.out.println("ENROLL success");
			} else if (arr[0].equals("CHPASS")) {
				for (int i = 0; i < credCount; i++) {
					String curruser = DB[i].getUsername();

					if (curruser.equalsIgnoreCase(arr[1])) {

						boolean setNewPassOk = DB[i].setNewPass(arr[2], arr[3]);

						if (setNewPassOk) {
							System.out.println("CHPASS success");
						} else {
							System.out.println("CHPASS fail");
						}
					}
				}
			} else if (arr[0].equals("AUTH")) {
				for (int i = 0; i < credCount; i++) {
					String curruser = DB[i].getUsername();
					if (curruser.equalsIgnoreCase(arr[1])) {
						if (DB[i].passValidation(arr[2])) {
							System.out.println("AUTH success");
						} else {
							System.out.println("AUTH fail");
						}
					}
				}
			}

		}

	}
}
