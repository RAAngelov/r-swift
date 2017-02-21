import java.util.Scanner;

public class Task5c_PrintEverySentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String Str = sc.nextLine();
		char [] str = Str.toCharArray();
		int size = str.length;
		for (int i = 0;i < size;i++){
			if (str [i] == '.' || str [i] == '!' || str[i] == '?'){
				System.out.println(str[i]);
			} else {
				System.out.print(str[i]);
			}
		}
		

	}

}
