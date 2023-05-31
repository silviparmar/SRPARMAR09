package bankaccount_java;

public class account {
	String name;
	int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int i) {
		balance = i;
	}
	public int withdraw(int amount) {
		if(balance >= amount && (balance - amount) >= 5000) {
			balance = balance - amount;
			return balance;
		}
		return -1;
	}

}
