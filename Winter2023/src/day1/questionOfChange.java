package day1;

public class questionOfChange {

	public static void main(String[] args) {
		int money = 1260;
		int answer = 0;
		
		while(true) {
			if(money>=500) {
				answer += money/500;
				money%=500;
			}
			else if(money>=100) {
				answer += money/100;
				money%=100;
			}
			else if(money>=50) {
				answer += money/50;
				money%=50;
			}
			else {
				answer+=money/10;
				break;
			}
		}
		System.out.print("ÃÑ °¹¼ö : "+answer);

	}

}
