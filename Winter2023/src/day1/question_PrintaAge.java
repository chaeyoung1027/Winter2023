package day1;

class Age {
	public int age(int age) {
		int answer = 0;
    
		answer = 2022-age+1;
		return answer;
	}
	
}

public class question_PrintaAge {

	public static void main(String args[]) {
		Age age = new Age();
		System.out.println(age.age(23));
	}
	
}
