package app_java_important;

import java.util.Arrays;

public class MergeAndSortArray {
	public static void main(String[] args) {
		int[] arr1= {1,3,5};
		int[] arr2= {2,4,6};
		
		int[] newArray=new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			newArray[i]=arr1[i];
		}
		
		int index=arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			newArray[index]=arr2[i];
			index++;
		}
		
		for (int i = 0; i < newArray.length-1; i++) {
			for (int j = 0; j < newArray.length-1; j++) {
				if(newArray[j]>newArray[j+1]) {
					int temp=newArray[j];
					newArray[j]=newArray[j+1];
					newArray[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
