package day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorStream {
	public static void main(String args[]) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 90),
				new Student("�ſ��", 92)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+"-"+score);
		});
	}
}