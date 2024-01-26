package app_java_1;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int n=20;
		boolean bool=isPrime(n);
		System.out.println(bool);
	}

	private static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for (int i = 2; i < n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
