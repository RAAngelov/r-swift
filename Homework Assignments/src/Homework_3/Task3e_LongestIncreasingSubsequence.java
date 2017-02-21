import java.util.Scanner;

public class Task3e_LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter N numbers :");
		int [] Arr = new int[N];
		for (int i = 0;i < Arr.length;i++){
			Arr[i] = sc.nextInt();
		}
		int maxLen = 1;
		int maxInd = 0;
		for (int i = 0;i < N;i++){
			int cLen = 1;
			while (i + cLen < N){
				if ( Arr[i + cLen - 1] < Arr[i + cLen]){
					cLen++;
				} else {
					break;
				}
			}
			if (cLen > maxLen){
				maxLen = cLen;
				maxInd = i;
			}
			i = i + cLen - 1;
			
		}
		System.out.print(Arr[maxInd]);
		for (int i = maxInd + 1;i < maxInd + maxLen;i++){
			System.out.print(" " + Arr[i]);
		}
		
		


	}
	
	
	
	
	

}
