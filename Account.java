
public class Account {

	private int accountNumber;
	private String accountName;
	private float initialAmount;
	private String city;
	
	public Account() {
		
	}
	public Account(int accountNumber, String accountName, float initialAmount, String city) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.initialAmount = initialAmount;
		this.city = city;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(float initialAmount) {
		this.initialAmount = initialAmount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", initialAmount="
				+ initialAmount + ", city=" + city + "]";
	}
	
}


