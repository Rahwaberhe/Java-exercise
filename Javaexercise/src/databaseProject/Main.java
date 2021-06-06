package databaseProject;


	import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
	import java.sql.Statement;
	
	public class Main {
		public static void main(String[] args) throws SQLException 
		 {
			 
			 // Question# 1 and 2
			 
			  Account account1 = new Account(2001, "John", "Doe", 2500.00);
			 Account account2 = new Account(2002, "Tesfay", "Kiros", 1250.00);
			 Account account3 = new Account(2004, "Hadgu", "Kindeya", 5000.30);
			 
			 createAccount(account1);
			 createAccount(account2);
			 createAccount(account3);
			
		
			 // Question number 3
			 //deposit 1000 for each account
			 Transaction transaction1 = new Transaction( "deposit", 1000, account1.getAccountNo());
			 Transaction transaction2 = new Transaction( "deposit", 1000, account2.getAccountNo());
			 Transaction transaction3 = new Transaction( "deposit", 1000, account3.getAccountNo());
		     
			 doTransaction(transaction1);
			 doTransaction(transaction2);
			 doTransaction(transaction3);
			 
			 //withdrwal
			Transaction transaction4 = new Transaction( "withdrawal", 500, account1.getAccountNo());
			 doTransaction(transaction4);
			 //Transfer
			 int fromAccount=account3.getAccountNo();
			 int toAccount=account2.getAccountNo();
			 double amount=750;
			 String reason="Gift";
			 Transfer transfer=new Transfer( fromAccount,  toAccount,  amount,  reason);
			 doTransfer(transfer);
			 Transaction transaction5 = new Transaction( "withdrawal", amount, account3.getAccountNo());
			 Transaction transaction6 = new Transaction( "deposit", amount, account2.getAccountNo());
			 doTransaction(transaction5);
			 doTransaction(transaction6);
			 
			
			 
		 }

		

		 public static void createAccount(Account account) {
		 
		 	Connection myConn = null;
			Statement myStmt = null;
			PreparedStatement prdstmt = null;
	
			try {
				// Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "Gebru700848");
				// Creat statement
			    myStmt = myConn.createStatement();
			    
				String mysql = "Insert into account (account_no, first_name, last_name, balance)values(?,?,?,?)";
				
				prdstmt = myConn.prepareStatement(mysql);
				// Insert account object
				System.out.println(account);
				
				prdstmt.setInt(1,account.getAccountNo());
				prdstmt.setString(2,account.getFirstName());
				prdstmt.setString(3,account.getLastName());
				prdstmt.setDouble(4,account.getBalance());				
				prdstmt.execute();
				
				System.out.println(" ");
				
				prdstmt.close();
				myConn.close();		
				
			}catch (Exception exc) {
				exc.printStackTrace();
			}
			 
		 }
		 public static void doTransaction(Transaction transaction) {
			 
			 	Connection myConn = null;
				Statement myStmt = null;
				PreparedStatement prdstmt = null;
					
				try {
				// Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "Gebru700848");
				// Creat statement
			    myStmt = myConn.createStatement();
			    String mysql2 = "Insert into transaction( transaction_type, amount, account_no) values (?,?,?)";
				
				prdstmt = myConn.prepareStatement(mysql2);
				System.out.println(transaction);
				prdstmt.setString(1,transaction.getTransactionType());
				prdstmt.setDouble(2,transaction.getAmount());
				prdstmt.setInt(3,transaction.getAccountNo());
			    prdstmt.execute();			    
			    System.out.println(" ");
			    prdstmt.close();
				myConn.close();	
				}catch (Exception exc) {
					exc.printStackTrace();
				}
				
				updateAccountBalance(transaction);
		 }
		 public static void updateAccountBalance(Transaction transaction) {
			 	Connection myConn = null;
				Statement myStmt = null;
				PreparedStatement prdstmt = null;
					
				try {
				// Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "Gebru700848");
				// Creat statement
			    myStmt = myConn.createStatement();
			    String mysql2 = "update bank_system.account set balance=balance + ? where account_no=?";
				prdstmt = myConn.prepareStatement(mysql2);
				
				System.out.println(transaction);
				
				if(transaction.getTransactionType()=="withdrawal") {

					prdstmt.setDouble(1,-1 * transaction.getAmount());
				}else {
					
					prdstmt.setDouble(1,transaction.getAmount());
				}
				System.out.println(transaction);
				prdstmt.setInt(2,transaction.getAccountNo());
			    prdstmt.execute();			    
			    System.out.println("Data successfuly Updated");
			    prdstmt.close();
				myConn.close();	
				}catch (Exception exc) {
					exc.printStackTrace();
				}
		 }
		 public static void doTransfer(Transfer transfer) {
			 
			 Connection myConn = null;
				Statement myStmt = null;
				PreparedStatement prdstmt = null;
		
				try {
					// Get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "Gebru700848");
					// Creat statement
				    myStmt = myConn.createStatement();
				    
					String mysql = "Insert into transfer (from_account, to_account, amount, reason)values(?,?,?,?)";
					
					prdstmt = myConn.prepareStatement(mysql);
					// creat object
					System.out.println( transfer);
					prdstmt.setInt(1,transfer.getFromAccount());
					prdstmt.setInt(2,transfer.getToAccount());
					prdstmt.setDouble(3,transfer.getAmount());
					prdstmt.setString(4,transfer.getReason());
					prdstmt.execute();
					System.out.println();
					System.out.println("Data successfuly Transfered");
					
					prdstmt.close();
					myConn.close();		
					
				}catch (Exception exc) {
					exc.printStackTrace();
				}
		
		 }
	}
	
	