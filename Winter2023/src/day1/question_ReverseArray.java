package day1;

class Reverse {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i<num_list.length; i++){
            answer[num_list.length-1-i] = num_list[i];
        }
        
        return answer;
    }
}

public class question_ReverseArray {

	public static void main(String[] args) {
		Reverse solution = new Reverse();
		int num_list[] = {1, 2, 3, 4, 5};
		System.out.println(solution.solution(num_list));
		
		
	}

}
