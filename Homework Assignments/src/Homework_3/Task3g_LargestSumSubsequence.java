import java.util.Scanner;


public class Task3g_LargestSumSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter " + N + " numbers :");
		int [] Arr = new int[N];
		for (int i = 0;i < Arr.length;i++){
			Arr[i] = sc.nextInt();
		}
		int mSum = 0;
		int mInd = 0;
		int L = 1;
		for (int K = 1;K <= N;K++){
			int cmaxSUM = 0;
			for(int i = 0;i < K;i++){
				cmaxSUM += Arr[i];
			}
			int cmaxInd = 0;
			for (int i = 1;i <= Arr.length - K;i++){
				int cSUM = 0;
				for (int j = i;j < i + K;j++){
					cSUM += Arr[j];
				}
				if (cSUM > cmaxSUM) {
					cmaxSUM = cSUM;
					cmaxInd = i;
				}
				
			}
			if(cmaxSUM > mSum){
				mSum = cmaxSUM;
				mInd = cmaxInd;
				L = K;
			}
			
			
		}
		System.out.print(Arr[mInd]);
		for (int i = mInd + 1;i < mInd + L;i++){
			
			System.out.print(" " + Arr[i]);
		
		}
		

	}

}
