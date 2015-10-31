package employee;

public class CeoBean extends EmployeeBean {

	public int getSalary() {

		int salary = (int) ((getPay() + getYearCount() * 1000) / 12);

		return salary;

	}
	
	

}
