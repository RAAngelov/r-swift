import java.lang.reflect.Array;
import java.util.*;


public class Task3h_PrintOddFrequencyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter N numbers :");
		int [] Arr = new int[N];
		for (int i = 0;i < Arr.length;i++){
			Arr[i] = sc.nextInt();
		}
		Arrays.sort(Arr);		
		for (int i = 0;i < Arr.length;i++){
			int count = 1;
			for (int j = i + 1;j < N;j++){
				if (Arr[i] == Arr[j]){
					count++;
				}
			}
			if (count % 2 != 0){
				System.out.println(Arr[i]);
			}
			i = i + count - 1;
		}
		
	}

}
