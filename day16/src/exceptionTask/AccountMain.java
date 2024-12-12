package exceptionTask;

class AccountException extends Exception{

	public AccountException(String msg) {
		super("출금 불가");
	}
	
}

public class AccountMain {
	public static void main(String[] args) {
		Account a = new Account();
		a.withdraw(0);
		a.deposit(0);
	}
}
