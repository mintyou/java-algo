package ex1;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		
		String name = scanner.next();
		
		System.out.println("과목을 입력하세요");
		
		String subject = scanner.next();
		
		System.out.println("점수를 입력하세요");

		int score = scanner.nextInt();
		
		Score sc = new Score(); // 클래스명 인스턴스(객체) = new 생성 
		String[] grade = sc.getGrade(name,subject,score);
		
		System.out.println("이름 : " + grade[0] + "과목 : " + grade[1] 
				+ " 점수 : " + score
				+ " 등급  : " + grade[2]);
		
		
		
	}
}
