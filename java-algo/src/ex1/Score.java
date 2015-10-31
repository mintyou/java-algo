package ex1;

public class Score {
	public String[] getGrade(String name, String subject, int score) {  //( )은 파라미터 존으로 지역변수와 동일하게 취급한다
		
		String[] arr = new String[3]; //배열선언할때 공식은 
		//타입 [] 배열변수 = new 타입[요소의 갯수];
		// new 는 배열이 객체임을 뜻한다
		arr[0] = name;
		arr[1] = subject;
		
		
		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}
		
		arr[2] = grade;
		return arr;
	}
}
