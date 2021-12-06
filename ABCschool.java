
import java.sql.*;
public class ABCschool {
	public static void main(String[] args) throws Exception{
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to the database!!");
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Suwarna","root","Sulur@#2002");
			System.out.println("You are connected to the databases");
			System.out.println("Inserting data or records into the table called StudentOfABC");
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from StudentOfABC");  
			
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1123,'Reema Shukla','V','2004-12-22',1234567890)");
			
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1124,'Suwarna Shukla','IX','2006-07-04', 1245678998)");
			
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1134,'Ashwin Sharma', 'X','2005-03-14', 2245664909)");
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1157,'Mehak Kaur', 'VI', '2007-07-24', 3245642199)");
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1010,'Alok Singh', 'X','2005-11-11',  2456789761)");
			stmt.executeUpdate("INSERT INTO Student (Roll, Studentname, Standard,DOB,FeesNo) "
			          +"VALUES (1211,'Sonal Shukla','IX', '2006-01-20',  3245675421)");
			System.out.println("Insert records into table .Please verify...");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		finally {
			conn.close();
			stmt.close();
		}
	}
}