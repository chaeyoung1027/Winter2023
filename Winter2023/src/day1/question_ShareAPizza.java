package day1;

class Pizza {
    public int solution(int n) {
        int answer = 0;
        if(n%7>0) answer = n/7+1;
        else answer = n/7;
        return answer;
    }
}

public class question_ShareAPizza {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		System.out.println(pizza.solution(3));

	}

}
