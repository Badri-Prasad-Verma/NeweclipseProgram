package app_java_important;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter rows and coluns for matrix1");
		  int r1=scan.nextInt();
		  int c1=scan.nextInt();
		  int[][] arr1=new int[r1][c1];
		  System.out.println("Enter the values of rows and columns");
		  for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		  
		  System.out.println("Enter rows and coluns for matrix2");
		  int r2=scan.nextInt();
		  int c2=scan.nextInt();
		  int[][] arr2=new int[r2][c2];
		  System.out.println("Enter the values of rows and columns");
		  for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		  
		  System.out.println("Matrix 1");
		  printMatrix(arr1);
		  System.out.println("Matrix 2");
		  printMatrix(arr2);
		  System.out.println("Addition of both matrix");
		  printAdditionOfMatrix(arr1,r1,c1,arr2,r2,c2);
		
  }

	private static void printAdditionOfMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
		if(r1!=c2) {
			System.out.println("Addition can not happen");
			return;
		}
		int[][] sum=new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					sum[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		printMatrix(sum);
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
