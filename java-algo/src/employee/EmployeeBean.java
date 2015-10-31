package employee;

public class EmployeeBean {

	/**
	 * 클래스 바로밑에 있는 변수는 메서드가 값을 공유하는 변수로 인스턴스 변수라고 하며,
	 * 인스턴스 변수가 있는 영역을 필드라고 한다.
	 * 필드가 아닌 영역을 메서드 에어리어 라고 하며
	 * 클래스는 필드와 메서드 에어리어 두개로 구성한다.
	 */
	private String name;	//이름
	private int joinYear;	//입사년도
	private int pay;	//연봉
	private double taxRate;	//세율
	
	
	//*******************************************
	
	public String getName() {
		return name;
	}
	public int getJoinYear() {
		return joinYear;
	}
	public void setJoinYear(int joinYear) {
		this.joinYear = joinYear;
	}
	public int getPay() {
		return pay;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public int getYearCount() {
		
		int yearCount = 2015 - joinYear;
		return yearCount;
	}
	
	public int getSalary() {
		
		int salary = (int) ((pay + getYearCount() * 100) / 12) - this.getTax();
		
		return salary;
		
	}
	
	public int getTax() {
		
		int ySalary = (pay + getYearCount() * 100);
		int tax = (int) (ySalary * taxRate / 12);
		return tax;
	}
	
	@Override
	public String toString() {
		return "************************************************ \n"
				+ "이름     입사년도     초봉     세금     이번달급여\n"
				+ "--------------------------------------------- \n"
				+ name + "\t" + joinYear + "\t" + pay + "\t"+  this.getTax() + "\t" + getSalary() + "\n"
				+ "*********************************************";
	}
	
	
}
