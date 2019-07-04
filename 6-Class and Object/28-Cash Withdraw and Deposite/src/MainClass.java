class Bank {
	private double balance = 0;
	private double withdraw_balance, deposite_balance;

	public synchronized void deposite(double deposite_bal) {
		deposite_balance = deposite_bal;
		balance += deposite_balance;
		System.out.println("Depsoite Rs" + deposite_balance);
		notify();
	}

	public synchronized void withdraw(double withdraw) throws InterruptedException {
		withdraw_balance = withdraw;
		if (balance < withdraw_balance) {
			System.out.println("Not enough balance");
			wait();
		}
		balance -= withdraw_balance;
		System.out.println("Withdraw Rs" + withdraw_balance);
	}

}

public class MainClass {
	public static void main(String args[]) {
		Bank bank = new Bank();
		Thread t1 = new Thread(() -> {
			try {
				bank.withdraw(1000.0);
			} catch (InterruptedException e) {
			}
		});
		Thread t2 = new Thread(() -> {
			bank.deposite(1000.0);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});
		t1.start();
		t2.start();
	}
}
