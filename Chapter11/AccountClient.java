package Chapter11;

public class AccountClient extends Account{
	
	private int id ;
	private String fullName;
	double quantity;
	double transfer;
	private Account account;
	
	public AccountClient() {
		
	}
	public AccountClient(int id,String fullName,Account account) {
		this.id=id;
		this.fullName=fullName;
		this.account=account;
	};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
	public void setAccount(Account account) {
		this.account=account;
	}
	public Account getAccount() {
		return account;
	}
	

	public double withDrawMoney(double quantity) {
		System.out.println("-----Para Çekme-----");
		System.out.println("Toplam Bakiye : " + account.balance); 
		account.setBalance(account.balance -= quantity);
		System.out.println("Para çekme sonrası toplam bakiye : " + account.balance);
		return account.balance;
		
	}
	
	public double investment(double quantity) {
		System.out.println("-----Para Yatırma-----");
		System.out.println("Toplam Bakiye : " + account.balance);
		account.setBalance(account.balance +=quantity);
		System.out.println("Para yatırma sonrası toplam bakiye : "+account.balance);
		return account.balance;
		
	}
	
	public void moneyTransfer(double quantity, double transfer , Account account2) {
		System.out.println("-----Havale İşlemi-----");
		System.out.println("Toplam Bakiye : " + account.balance);
		account.setBalance (account.balance-quantity-transfer);
		account2.setBalance(account2.balance+quantity);		
		System.out.println("Havale işlemi gerçekleştikten sonraki toplam bakiye : " + account.balance);
		
	}

	
	
	
	
	
}