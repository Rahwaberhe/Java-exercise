package bank;
//Question2
//Write a java program to Insert 5 records into the account table using prepared statement 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Insertpreparedstmt {
	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		int myRs = 0;
		try {
			// get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gebru700848");
			System.out.println("Database connection successful!\n");
			
			//prepare statment 
			String sql = "insert into account (account_no, first_name, last_name, balance) values(?,?,?,?), (?,?,?,?), (?,?,?,?), (?,?,?,?), (?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			//insert data
			myStmt.setInt(1, 101);
			myStmt.setString(2, "Rahwa");
			myStmt.setString(3, "Berhe");
			myStmt.setDouble(4, 20000);
			//insert data
			myStmt.setInt(5, 102);
			myStmt.setString(6, "Makda");
			myStmt.setString(7, "Gebru");
			myStmt.setDouble(8, 40000);
			
			//insert data
			myStmt.setInt(9, 103);
			myStmt.setString(10, "Samrawit");
			myStmt.setString(11, "Kidane");
			myStmt.setDouble(12, 60000);
			
			//insert data
			myStmt.setInt(13, 104);
			myStmt.setString(14, "Haftom");
			myStmt.setString(15, "Welemse");
			myStmt.setDouble(16, 80000);
			//insert data
			myStmt.setInt(17, 105);
			myStmt.setString(18, "Smenesh");
			myStmt.setString(19, "Ermiyas");
			myStmt.setDouble(20, 100000);
			myRs = myStmt.executeUpdate();
			System.out.println("Rows inserted" + myRs);
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
		}
		if (myConn != null) {
			myConn.close();
		}
		if (myStmt != null) {
		myStmt.close();
		}
	}
}
 


