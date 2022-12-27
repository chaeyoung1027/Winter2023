package day2;

import java.util.Arrays;
import java.util.Collections;

public class descendingOrder {

	public static void main(String[] args) {
		String[] str = {"a", "1", "가", "A", "3", "나"};
	      for(String s : str) {
	         System.out.print(s + " ");   //정렬 전 출력
	      }
	      System.out.println();
	      
	      Arrays.sort(str, Collections.reverseOrder());
	      for(String s : str) {
	         System.out.print(s + " ");   //정렬 후 출력
	      }

	}

}
