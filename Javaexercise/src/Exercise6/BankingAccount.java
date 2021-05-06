package Exercise6;

public class BankingAccount {

	public static void main(String[] args) {
		//create account
		Account RahwaAccount = new Account("Rahwa","Berhe", 100012, 6000);
		Account HagosAccount = new Account("Hagos","Gebru", 10001, 5000);
		Account JamesAccount = new Account("james","Bond",10002, 3000);
		System.out.println(RahwaAccount);
	    RahwaAccount.debit(1000);
	    System.out.println(RahwaAccount);
	    RahwaAccount.credit(1500);
		System.out.println(HagosAccount);
		HagosAccount.debit(3000);
		System.out.println(HagosAccount);
		HagosAccount.credit(1000);
		System.out.println(JamesAccount);
		HagosAccount.debit(4000);
		
       
        
	}
	

}
