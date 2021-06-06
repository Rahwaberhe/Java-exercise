package bank;
//Question#6
//Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
//Example:	‘Highest Balance: john, Doe, 9500
//‘Lowes Balance:  dave, james, 1500
//package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class AccountDetail {

public static void main(String[] args) throws SQLException {
	Connection connection = null;
	Statement myStmt = null;
	ResultSet myRs = null;
		try {
		//String username = "root";
		//String password = "Gebru700848";
	    // 1. Get a connection to database
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gebru");
	    System.out.println("Database connection successful!\n");
	    // 2. Create a statement
	    myStmt = connection.createStatement();
	    // 3. Execute SQL query
	  
	    //‘Highest Balance: 
	    //18	Semenesh	Ermiyas	160000
		    
	    myRs = myStmt.executeQuery("SELECT * FROM bank.account order by balance desc limit 1");
	    //‘Lowes Balance: 
	   	//20	Ziyada	Kulen	16000

	    myRs = myStmt.executeQuery("SELECT * FROM bank.account order by balance asc limit 1");
	    // 4. Process the result set
	    while (myRs.next()) {
		System.out.println(myRs.getString("first_name") + myRs.getString("last_name")+ myRs.getDouble("balance"));
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
	    if (connection != null) {
	   	connection.close();
	    }
		}
			
		}
}