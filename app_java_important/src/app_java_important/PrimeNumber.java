package app_java_important;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=20;
		for (int i = 1; i <=n; i++) {
			int temp=0;
			for (int j = 2; j <=i-1; j++) {
				if(i%j==0) {
					temp=1;
					break;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
		}
	}
}
