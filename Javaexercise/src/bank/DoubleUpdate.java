package bank;
//Question3
//Write a java program to double the balances of each record (hint update each record)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DoubleUpdate {
	public static void main(String[] args) throws SQLException {
				Connection myConn = null;
				PreparedStatement myStmt = null;
				int myRs = 0;
	
				try {
					// get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gebru700848");
					System.out.println("Database connection successful!\n");
					
					//prepare statment 
					String sql = "update account set balance = balance * 2 where account_no in (101,102,103,104,105)";
					myStmt = myConn.prepareStatement(sql);
					
	
					myRs = myStmt.executeUpdate();
					System.out.println("Rows inserted" + " " + myRs);
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
