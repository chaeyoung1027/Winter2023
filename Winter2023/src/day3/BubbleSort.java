package day3;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = {89, 45, 67, 92, 39, 74, 26, 90};
		System.out.print("정렬 전 배열 : ");
		for(int i:intArray)
			System.out.print(i+" ");
		BubbleSort(intArray);
		System.out.println();
		System.out.print("정렬 후 배열 : ");
		for(int i:intArray)
			System.out.print(i+" ");

	}
	static int[] BubbleSort(int[] A) {
		int temp = 0;
		for(int i = 0; i<A.length; i++) {
			for(int j = i+1; j<A.length; j++) {
				if(A[i]>A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return A;
	}

}
