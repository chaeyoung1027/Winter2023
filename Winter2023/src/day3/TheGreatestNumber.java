package day3;

import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        for(int i = 0 ; i<numbers.length; i++){
            strNums[i] = ""+numbers[i];
        }
        Arrays.sort(strNums, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        for(String s:strNums)
            answer += s;
        
        return answer;
    }
}

public class TheGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
