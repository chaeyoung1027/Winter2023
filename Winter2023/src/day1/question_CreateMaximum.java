package day1;
import java.util.*;

class Maximum {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];

    }
}

public class question_CreateMaximum {

	public static void main(String args[]) {
		Maximum solution = new Maximum();
		int numbers[] = {1, 2, 3, 4, 5};
		System.out.println(solution.solution(numbers));
	}

}
