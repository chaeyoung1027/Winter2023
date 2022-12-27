package day1;

class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = num1; i<=num2; i++){
            answer[i-num1] = numbers[i];
        }
        return answer;
    }
}

public class qustion_cutArray {
	public static void main(String args[]) {
		CutArray solution = new CutArray();
		int numbers[] = {1, 2, 3, 4, 5};
		int answer[] = solution.solution(numbers, 1, 4);
		
		for(int i:answer) {
			System.out.print(i+" ");
		}
	}

}
