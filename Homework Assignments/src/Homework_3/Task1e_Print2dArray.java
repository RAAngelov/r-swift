package Homework_3;
import java.util.Scanner;

public class Task1e_Print2dArray {

	public static void main(String[] args) {
	    int [][] Arr = new int [4][4];
		for(int row = 0;row < 4;row++){
			for(int col = 0;col < 4;col++){
				Arr[row][col] = 4*row + col + 1;
			}
		}
		for(int row = 0;row < 4;row++){
			for(int col = 0;col < 4;col++){
		System.out.print(Arr[row][col]);
			}
		System.out.println();	
		}

		}

	}


