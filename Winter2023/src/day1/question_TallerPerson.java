package day1;

class Tall {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i:array)
            if(i>height) answer++;
        return answer;
    }
}

public class question_TallerPerson {
	public static void main(String[] args) {
		Tall solution = new Tall();
		int array[] = {156, 160, 166, 170, 171, 172, 174, 177, 180};
		int height = 171; //주인공의 키
		System.out.println(solution.solution(array, height));

	}
}
