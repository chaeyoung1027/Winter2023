package day1;

import java.util.Arrays;

public class ArrayClass_copy {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for(int i = 0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
		
		char[] arr1 = {'J','A','V','A'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+", ");
		}
		System.out.println();
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+", ");
		}
	}
}
