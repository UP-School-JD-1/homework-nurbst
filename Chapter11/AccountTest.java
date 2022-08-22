package Chapter11;

public class AccountTest {
	public static void main(String[] args) {

		Account account1 = new Account(1000);
		Account account2 = new Account(500);
		AccountClient accountClient1 = new AccountClient(1,"Nur Aleyna Bostan",account1);
		
		accountClient1.withDrawMoney(200);
		accountClient1.investment(100);
		accountClient1.moneyTransfer(50,1.75,account2);
	}
}