package operator;

import java.util.Scanner;

public class Gogo {
	String result = ""; //문자열 타입 초기화 방
	public String calc(int dan) {

		for (int i = 1; i < 10; i++) {
//			System.out.print(dan + "*" + i + "=" + dan * i + "\n");
			result = dan + "*" + i + "=" + dan * i + "\n";
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Gogo gogo = new Gogo();
		System.out.println("구구단 출력을 할 단을 입력 단2~9까지만");
		int dan = scanner.nextInt();
		String result = gogo.calc(dan);
		System.out.println(result);

	}
}
