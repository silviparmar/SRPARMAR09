package bankaccount_java;

public class withdraw {
	public static void main(String args[]) {
		account a = new account();
		a.setName("Silvi");
		a.setBalance(50000);
		
		System.out.println(a.withdraw(10000));
				}

}
