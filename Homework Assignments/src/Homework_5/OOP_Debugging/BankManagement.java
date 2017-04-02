package Homework_5.OOP_Debugging;

import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		Bank bank = new Bank();
		while (!(str = sc.nextLine()).equalsIgnoreCase("END")) {
			String arr[] = str.split(" ", 5);
			if(arr[0].equals("OPEN")) {
				System.out.print("OPEN ");
				System.out.println(bank.openAccount(arr[1],arr[2],arr[3],arr[4]) 
						? "success" : "fail");
			} else if (arr[0].equals("CLOSE")) {
				System.out.print("CLOSE ");
				System.out.println(bank.closeAccount(arr[1],arr[2])
						? "success" : "fail");
			} else if (arr[0].equals("DEPOSIT")) {
				System.out.print("DEPOSIT ");
				System.out.println(bank.deposit(arr[1],Double.parseDouble(arr[2]))
                        ? "success"
                        : "fail");
			} else if (arr[0].equals("TRANSFER")) {
				System.out.print("TRANSFER ");
				System.out.println(bank.transfer(arr[1],arr[2],Double.parseDouble(arr[3]),arr[4])
                        ? "success"
                        : "fail");
			} else if (arr[0].equals("WITHDRAW")) {
				System.out.print("WITHDRAW ");
				System.out.println(bank.withdraw(arr[1],arr[2],Double.parseDouble(arr[3]))
                        ? "success"
                        : "fail");
			}
		}
		System.out.println(bank.getAssets());
		bank.printBankAccounts();
	}
}
