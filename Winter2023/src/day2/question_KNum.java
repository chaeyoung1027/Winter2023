package day2;

import java.util.Arrays;

class KNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            int start= commands[i][0] -1;
            int end = commands[i][1];
            int k = commands[i][2]-1;
            
            int[] tmp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(tmp);
            answer[i] = tmp[k];
        }
        
        return answer;
    }
}

public class question_KNum {

	public static void main(String[] args) {
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][]commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		KNum solution = new KNum();
		int answer[] = solution.solution(array, commands);
		
		for(int i:answer)
			System.out.print(i+" ");
	}

}
