import java.util.Arrays;
import java.util.Scanner;


public class Task3c_PrintClusterCount {

	public static void main(String[] args) {
		System.out.print("Enter number of elements :");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] Arr = new int[N];
		System.out.print("Enter specific elements:");
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0;i < N;i++){
			int cLen = 1;
			while (i + cLen < N){
				if (Arr[i + cLen - 1] == Arr[i + cLen]){
					cLen++;
				} else {
					break;
				}
			}
			if (cLen >= 2){
				count++;
			}
			i = i + cLen - 1;

       }
		System.out.println(count);
    
	}
	}
