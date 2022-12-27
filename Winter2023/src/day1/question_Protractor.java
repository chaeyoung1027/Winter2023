package day1;

class Protractor {
    public int solution(int angle) {
        int answer = 0;
        if(angle>0&&angle<90) answer = 1;
        else if(angle == 90) answer=2;
        else if(angle>90&&angle<180) answer = 3;
        else answer = 4;
        
        return answer;
    }
}

public class question_Protractor {

	public static void main(String[] args) {
		Protractor solution = new Protractor();
		int angle = 120;
		System.out.println(solution.solution(angle));

	}

}
