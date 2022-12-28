package day3;

import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        for(int i = 0 ; i<numbers.length; i++){
            strNums[i] = ""+numbers[i];
        }
        //Arrays.sort(strNums);
        int p = 0;
        for(int i = 0; i<strNums.length-1; i++){
            for(int j = i+1; j<strNums.length; j++){
                String s1 = strNums[i];
                String s2 = strNums[j];
                
                if((s1+s2).compareTo(s2+s1)<0){
                    //순서가 바뀌는 로직 작성
                    strNums[i] = strNums[j];
                    strNums[j]= s1;
                    
                }
            }
        }
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
