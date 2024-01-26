package app_java_important;

import java.util.LinkedList;

public class MergeLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		LinkedList<Integer> merge=mergeLinkedList(list1,list2);
		System.out.println(merge);
	}

	private static LinkedList<Integer> mergeLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> mergedList=new LinkedList<Integer>();
		int i=0,j=0;
		while(i<list1.size() && j<list2.size()) {
			if(list1.get(i)<list2.get(j)) {
				mergedList.add(list1.get(i));
				i++;
			}else {
				mergedList.add(list2.get(j));
				j++;
			}
		}
		while(i<list1.size()) {
			mergedList.add(list1.get(i));
			i++;
		}
		while(j<list2.size()) {
			mergedList.add(list2.get(j));
			j++;
		}
		return mergedList;
	}
}
