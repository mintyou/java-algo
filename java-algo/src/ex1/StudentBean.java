package ex1;

public class StudentBean {
	String name;
	String subject;
	int score;
	String grade;
	
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public String getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setGrade(int score) {
		
		
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
		
		
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "학생성적표  [이름 =" + name + ", 과목=" + subject + ", 점수=" + score + ", 등급=" + grade + "]";
	}
	
	
}
