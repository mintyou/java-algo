package operator;

import java.util.Scanner;

public class ArithmeticMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Arithmetic arithmetic = new Arithmetic();
		
		while (true) {
			System.out.println("게속 o 종료 x");
			String goOrStop = scanner.next();
			if (goOrStop.equals("x")) {
				System.out.println("종료");
				return;
			}
			System.out.println("a값 입력");
			int a = scanner.nextInt();
			System.out.println("연산자 입력");
			String op = scanner.next();
			System.out.println("b값 입력");
			int b = scanner.nextInt();
			
//			arithmetic.calc(a, b, op);
//			String s = "";
//			s = arithmetic.calc(a, b, op);
//			System.out.println(s);
			
			System.out.println(arithmetic.calc(a, b, op));
		}
	}
}
