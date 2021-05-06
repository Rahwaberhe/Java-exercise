package Exercise6;

public class Account {
	//creat attributes
	private String FirstName;
	private String LastName;
	private long accountNumber;
	private double balance;
	//q5INCREMENTER??
	
	//constructors
	public Account(String firstName, String LastName,  long accountNumber, double balance) {
		  this.FirstName = FirstName;
		  this.LastName = LastName;
		  this.accountNumber = accountNumber;
		  this.balance = balance;
	}
	//getter and setter
	public String getFirsName() {
		 return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public void setLastName(String LastName ) {
		this.LastName = LastName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [FirstName=" + FirstName + ", LastName=" + LastName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	//debit method
	public void debit(double withdrawAmount) {
	 this.balance = this.balance - withdrawAmount;
	 //check if there is enough money
	 if(balance < withdrawAmount) {
		  System.out.println("Insufficient Balence!");
	 }else {
	 }
	}
	//credit method
	public void credit(double depositAmount) {
		this.balance = this.balance + depositAmount;
	}
	}
	
	
	
	
	
	
	
	
	

	
		

	
	

