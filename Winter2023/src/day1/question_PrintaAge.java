package day1;

class Solution {
	public int solution(int age) {
		int answer = 0;
    
		answer = 2022-age+1;
		return answer;
	}
	
}

public class question_PrintaAge {

	public static void main(String args[]) {
		Solution solution = new Solution();
		System.out.println(solution.solution(23));
	}
	
}
