package employee;

import java.util.Scanner;

public class CeoMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CeoBean bean = new CeoBean();
		
		System.out.println("직원이름 : ");
		String name = scan.next();
		System.out.println("입사년 : ");
		int year = scan.nextInt();
		System.out.println("초봉 : ");
		int pay = scan.nextInt();
		System.out.println("세율");
		double taxRate = scan.nextDouble();
				
		
		bean.setName(name);
		bean.setJoinYear(year);
		bean.setPay(pay);
		bean.setTaxRate(taxRate);
		
		System.out.println(bean.toString());
		
	}
}
