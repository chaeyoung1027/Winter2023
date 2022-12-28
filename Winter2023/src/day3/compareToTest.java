package day3;

public class compareToTest {

	public static void main(String[] args) {
		Integer x = 3;
		Integer y = 4;
		Double z = 1.0;
		int x1 = 4;
		int xy = 5;
		String str = "abcd";
	
		System.out.println(Integer.compare(x, y));
		
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(2));

		System.out.println(str.compareTo("abcd"));
		System.out.println(str.compareTo("ab"));		//4-2->2
		System.out.println(str.compareTo("a"));	//3
		System.out.println(str.compareTo("c"));	// -2 A와 C의 아스키코드의 차이 C-A
		
		System.out.println(str.compareTo("hello"));
	}

}
