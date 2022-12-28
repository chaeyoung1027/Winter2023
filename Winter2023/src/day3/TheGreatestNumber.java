package day3;

import java.util.*;
class GN {
    public String solution(int[] numbers) {
        String[] stringNumbers = new String[numbers.length];
   
       //int�� �迭�� String�� �迭�� �ٲ�
       for(int i = 0; i < numbers.length; i++) {
          stringNumbers[i] = Integer.toString(numbers[i]);
       }

       //�� ���� �����ư��� ��ģ �� �� ū ���� ������ ����(�������� ����)
       Arrays.sort(stringNumbers, new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
             return (o2+o1).compareTo(o1+o2);
          }
       });

       if(stringNumbers[0].equals("0")) return "0";

       //���ڿ��� delimiter("") �������� ��ħ
       return String.join("", stringNumbers);
    }
}

public class TheGreatestNumber {

	public static void main(String[] args) {
		int numbers[] = {6, 10, 2};
		//3, 30, 34, 5, 9
		GN solution = new GN();
		System.out.println(solution.solution(numbers));
		
	}

}
