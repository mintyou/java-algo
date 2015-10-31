package account;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		AccountBean account = new AccountBean();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.next();
		System.out.println("입금액 입력해주세요");
		int deposit = scanner.nextInt();
		System.out.println("출금액 입력해주세요");
		int withdraw = scanner.nextInt();
		
		account.setName(name);
		account.setDeposit(deposit);
		account.setWithdraw(withdraw);
		
		System.out.println(account.toString());
	}
}
