package account;

public class AccountBean {
	String name;
	int deposit;
	int withdraw;
	
	public String getName() {
		return name;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public String getBalance() {
		String balance = "";
		if (withdraw > deposit) {//출금액이 입금액보다 크면
			balance = "출금할수없습니다.";
		} else {
			balance = String.valueOf(deposit-withdraw);
		}

		return balance;
	}
	public int getAccountNo() {
		int accountNum = (int) (Math.random() * 999999 + 100000);//곱셈뒤가 마지막값, +뒤가 끝값 중에 임의에 램덤숫자를 반환 발생함
		
		return accountNum;
	}
	
	@Override
	public String toString() {
		return "통장내역 [계좌번호=" + this.getAccountNo() + ", 이름=" + name + ", 잔액=" + this.getBalance() + "]";
	}
	
	
	
}
