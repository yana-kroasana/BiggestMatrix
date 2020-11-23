package info;

import java.util.Scanner;

public class BiggestMatrix {

	public static void main(String[] args) {
		
		final int arraySize = 5;
		int[][] matrix = new int[arraySize][arraySize];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arraySize; i++) {
			for(int j = 0; j < arraySize; j++) {
				System.out.println( "Enter a number of index " + i + ", " + j);
				matrix[i][j] = sc.nextInt();
			}
			
		}
		
		for( int i = 0; i < arraySize; i++) {
			for( int j = 0; j < arraySize; j++) {
				System.out.print( matrix[i][j] + "\t");
			}
			System.out.println();	
		}
		
	int indexMaxSum = 0, maxSum = 0;
		for( int i = 0; i < arraySize; i++ ) {
			int sumCurrentRow = 0;
			for( int j = 0; j < arraySize; j++) {
				sumCurrentRow += matrix[i][j];
			}
			
			if( i == 0) {
				indexMaxSum = 1;
				maxSum = sumCurrentRow;
				} else if( sumCurrentRow > maxSum) {
					indexMaxSum = i;
					maxSum = sumCurrentRow;
				}
		}	
		
		System.out.println("The row with the biggest sum of elements is with index " + indexMaxSum );
	}
}
