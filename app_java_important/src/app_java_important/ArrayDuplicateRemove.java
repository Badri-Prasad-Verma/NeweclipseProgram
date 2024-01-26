package app_java_important;

public class ArrayDuplicateRemove {
	public static void main(String[] args) {
		int[] x= {1,2,2,3,4,4,5,6,6,7};
		int[] y=new int[x.length];
		int j=0;
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]!=x[i+1]) {
				y[j]=x[i];
				j++;
			}
			y[j]=x[x.length-1];
		}
		for (int s : y) {
			System.out.println(s);
		}
	}
}
