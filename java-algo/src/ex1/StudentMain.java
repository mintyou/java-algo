package ex1;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("과목을 입력하세요");
		String subject = scanner.next();
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		StudentBean bean = new StudentBean();
		bean.setName(name);
		bean.setSubject(subject);
		bean.setScore(score);
		bean.setGrade(score);
		
		System.out.println(bean.toString());

	}
}
