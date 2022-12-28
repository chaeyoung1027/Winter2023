package day3;

import java.util.*;
class H_In {
    public int solution(int[] citations) {
        int answer = 0;
        int hIndex = 0;
        Arrays.sort(citations);
        for(int i = 0; i<citations.length; i++){
            hIndex = citations.length - i;
            if(citations[i]>=hIndex){
                answer = hIndex;
                break;
            }
        }
        return answer;
    }
}

public class H_Index {

	public static void main(String[] args) {
		int citations[] = {3, 0, 6, 1, 5};
		H_In solution = new H_In();
		System.out.println(solution.solution(citations));

	}

}
