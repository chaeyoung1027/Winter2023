 package day1;

import java.util.Arrays;

public class ArrayClass_print {

   public static void main(String[] args) {
      //1. Arrays.copyOf
      /*      char[] arr1 = {'J','A','V','A'};
      char[] arr2 = Arrays.copyOf(arr1, arr1.length);
      System.out.println(arr2);*/
      
//      int[] arr= {0,1,2,3,4};
//      int[] arr2 = Arrays.copyOf(arr, arr.length);
//      for(int i=0; i<arr.length; i++) {
//         System.out.print(arr2[i]+ " ");
//      }
//      System.out.println();
//      int[] arr3 = Arrays.copyOf(arr, 3);
//      for(int i=0; i<arr3.length; i++) {
//         System.out.print(arr3[i]+ " ");
//      }
//      System.out.println();
//      int[] arr4 = Arrays.copyOf(arr, 7);
//      for(int i=0; i<arr.length; i++) {
//         System.out.print(arr4[i]+ " ");
//      }
      
      
      //2. 배열의 출력 - toString
//      int[] arr = {0,1,2,3,4};
//      int[][] arr2D = {{11,12}, {21,22}};
//      
//      System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.deepToString(arr2D));
      
      
      //3. 배열 항목 비교 - equals, deepEquals
//      String[][] str2D = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
//      String[][] str2D2 = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
//      
//      System.out.println(Arrays.equals(str2D, str2D2));
//      System.out.println(Arrays.deepEquals(str2D, str2D2));
      
      
      //4. 배열 채우기 - fill(), setAll()
//      int[] arr = new int[5];
//      Arrays.fill(arr, 9);
//      Arrays.setAll(arr, (i) -> (int)(Math.random()*5+1));
   }

}