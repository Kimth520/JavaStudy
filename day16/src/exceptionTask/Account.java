package exceptionTask;

public class Account {
	//필드
	private int balance;
	
	//생성자
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	
	//메소드
	void withdraw(int minus) throws AccountException {
		if(balance<minus) {
			try {
				throw new AccountException();
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("현재 잔고는" + balance + "입니다");
		}else {
			balance -= minus;
		}
	}
	

	void deposit(int plus) {
		balance += plus;
		System.out.println("잔액에 입금된 금액 추가 후 입금된 금액은 " + plus + "입니다" ); 
		System.out.println("현재 잔고는 " + balance + "입니다");
	}
	
	
}
