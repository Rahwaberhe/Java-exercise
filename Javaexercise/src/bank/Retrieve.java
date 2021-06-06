package bank;
//Question4
//Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Retrieve {
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
			myRs = myStmt.executeQuery("select * from bank.account order by balance asc");
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name") + ", " + myRs.getString("balance"));
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

