/*************************************************************************
	> File Name: BankAccount.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月25日 星期五 21时41分23秒
 ************************************************************************/
/*   一个特殊用途的类： 银行账户*/

public class BankAccount {
	protected String account;
	protected double balance;

	public BankAccount(String acc, double bal) {
        account = acc;
		balance = bal;
	}

	public boolean equals(Object other) {
		if (this.getClass() != other.getClass()) return false;
        BankAccount that = (BankAccount)other;
		return this.account.equals(that.getAccount());
	}

	public String getAccount() {
        return account;
	}

	public double getBalance() {
        return balance;
	}

	// 存款
	public void deposit(double amount) {
        balance += amount;
	}

	// 取款
	public void withdraw(double amount) {
        balance -= amount;
	}

	public static void main(String[] args) {
		// 计算100美元 年息5% 存款10年
		BankAccount j1 = new BankAccount("j1", 100);
		// 计算100美元 年息2.5% 存款20年
		BankAccount j2 = new BankAccount("j2", 100);

		for (int year = 0; year < 10; year++) {
			j1.deposit(j1.getBalance() * 0.05);
		}

		for (int year = 0; year < 20; year++) {
			j2.deposit(j2.getBalance() * 0.025);
		}

		System.out.println("100 10   5%: " + j1.getBalance());
		System.out.println("100 20 2.5%: " + j2.getBalance());
	}
}
