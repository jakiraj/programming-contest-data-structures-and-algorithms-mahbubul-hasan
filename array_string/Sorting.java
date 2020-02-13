package array_string;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a [] = {1, 5, 9, 2, 4, 3, 7, 6};
		Arrays.sort(a);
		int [] descArr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			descArr[i] = a[(a.length-1)-i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(descArr));	
	}
}
