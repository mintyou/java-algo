package operator;

import java.util.Scanner;

public class NameMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Name name = new Name();
				
		System.out.println("이름을 입력하세요");
		
		System.out.println("당신의 이름은 " + name.name(scanner.next()) + " 입니다");
	}
}
