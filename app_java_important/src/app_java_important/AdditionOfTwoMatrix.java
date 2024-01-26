package app_java_important;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows and columns of Matrix 1");
		int r1=scan.nextInt();
		int c1=scan.nextInt();
		int[][] a=new int[r1][c1];
		System.out.println("Enter the values of rows and columns");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter rows and columns of Matrix 1");
		int r2=scan.nextInt();
		int c2=scan.nextInt();
		int[][] b=new int[r2][c2];
		System.out.println("Enter the values of rows and columns");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matrix 1");
		printMatrix(a);
		System.out.println("Matrix 2");
		printMatrix(b);
		System.out.println("Addition of matrix 1 and matrix 2");
		printMatrixAddition(a,r1,c1,b,r2,c2);
	}

	private static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void printMatrixAddition(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
		if(r1!=r2 || c1!=c2) {
			System.out.println("Addition can not happen");
		}
		
		int[][] sum=new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		printMatrix(sum);
	}
}
