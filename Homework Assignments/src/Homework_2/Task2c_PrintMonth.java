import java.util.Scanner;

public class Task2c_PrintMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of elements N:");
		int N = sc.nextInt();
		
		if(N == 1){
			System.out.print("January");
		}
		if(N == 2){
			System.out.print("February");
		}
		if(N == 3){
			System.out.print("March");
		}
		if(N == 4){
			System.out.print("April");
		}
		if(N == 5){
			System.out.print("May");
		}
		if(N == 6){
			System.out.print("June");
		}
		if(N == 7){
			System.out.print("July");
		}
		if(N == 8){
			System.out.print("August");
		}
		if(N == 9){
			System.out.print("September");
		}
		if(N == 10){
			System.out.print("October");
		}
		if(N == 11){
			System.out.print("November");
		}
		if(N == 12){
			System.out.print("December");
		}
		else {
		System.out.print("Error");
		}
		
		

	}

}
