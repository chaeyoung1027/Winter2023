package day1;

class Sum_Even {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}

public class question_SumOfEvenNumbers {

	public static void main(String[] args) {
		Sum_Even solution = new Sum_Even();
		int n = 12;
		System.out.println(solution.solution(n));

	}

}
