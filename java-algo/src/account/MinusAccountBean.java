package account;

public class MinusAccountBean extends AccountBean {

	// 오버라이드는 부모클래스의 특정메서드를 변경할때
	// 부모메서드를 못쓰게하고 자식메서드만 쓰게하는 표
	@Override
	public String getBalance() {
		String balance = "";
		if (withdraw > deposit) {// 출금액이 입금액보다 크면
			balance = "대출금은 " + (withdraw - deposit);
		} else {
			balance = String.valueOf(deposit - withdraw);
		}

		return balance;
	}

}
