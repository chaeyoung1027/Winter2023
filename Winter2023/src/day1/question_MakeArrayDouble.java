package day1;

class Double {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}

public class question_MakeArrayDouble {
	public static void main(String args[]) {
		Double solution = new Double();
		int numbers[] = {1, 2, 3, 4, 5};
		int answer[] = solution.solution(numbers);
		for(int i:answer) {
			System.out.println(i+" ");
		}
	}
}
