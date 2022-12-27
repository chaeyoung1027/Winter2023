package day1;

class Duplicate {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i:array){
            if(i==n) answer++;
        }
        
        return answer;
    }
}

public class quesiton_NumberOfDuplicate {
	public static void main(String[] args) {
		Duplicate solution = new Duplicate();
		int array[] = {1, 2, 3, 4, 4, 5, 6};
		int n= 4;
		System.out.println(solution.solution(array, n));

	}
}
