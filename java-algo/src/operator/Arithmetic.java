package operator;


public class Arithmetic {
	// int c; // 인스턴스 변수

	public String calc(int a, int b, String op) {
		String s = "";

		switch (op) {
		case "+":
			s = "A + B = " + (a + b);
			break;
		case "-":
			s = "A - B = " + (a - b);
			break;
		case "*":
			s = "A * B = " + (a * b);
			break;
		case "/":
			s = "A / B = " + (a / b);
			break;
		case "%":
			s = "A % B = " + (a % b);
			break;

		default:
			break;
		}

		return s;

	}
		
	}

