package day1;

import java.util.Arrays;

class Average {
    public double solution(int[] numbers) {
        double answer = 0;
        //规过 1
        // for(int i = 0; i<numbers.length; i++){
        //     answer+=numbers[i];
        // }
        
        //规过 2
        //for(int i; numbers){
        //    answer+=i;
        //}
        //return answer/numbers.length;
        
        //规过3
        return Arrays.stream(numbers).average().orElse(0);

    }
}

public class question_AverageOfArray {

	public static void main(String[] args) {
		Average solution = new Average();
		int numbers[] = {1, 2, 3, 1, 5, 216, 472, 1, 1};
		System.out.println(solution.solution(numbers));

	}

}
