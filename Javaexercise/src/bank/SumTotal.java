package bank;
//Question5
//Write a java program that Calculates the total sum of the balances for all accounts and print it out.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SumTotal{
	
public static void main(String[] args) throws SQLException {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gebru700848");
			System.out.println("Database connection successful!\n");
			// 2. Create a statement
			myStmt = myConn.createStatement();
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select sum(balance)from bank.account");
			// 4. Process the result set
			int sum =1;
			while (myRs.next()) {
				
				double balance = myRs.getDouble (sum);
						
		    	 System.out.println(balance);
				
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			
		} finally {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}
}

