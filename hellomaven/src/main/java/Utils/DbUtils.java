package Utils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbUtils {
	String UName="root";
	String Password="root";
	String DbName="cromacamps";
	String URL="jdbc:mysql://127.0.0.1:3306/product";
	java.sql.Connection con=null;
	 Statement stmt=null;
	 public void readFromDB(){
		try{
		// 1.To register the driver class name
			Class.forName("com.mysql.jdbc.driver");
			System.out.println("Connecting to database ");
		// 2.Create a connection 
			con=DriverManager.getConnection(URL, UName, Password);
		// 3.Create the Statement	through connection (con)
			Statement stmt=con.createStatement();
			//Select all data  from Table
			String sql="select*from probucts ";
			System.out.println("sql");
		// 4.Get/send the statement 
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3));
				System.out.println();
				
			}
		 }
		catch(Exception e){
			
		}
	 }
		public void writeToDB(){
			try{
				Class.forName("com.mysql.jdbc.driver");
				con=DriverManager.getConnection(URL, UName, Password);
				Statement stmt=con.createStatement();
				String sql = "insert into products values(21,\"bags\",600 )";
				int rs=stmt.executeUpdate(sql);
				
			}
			catch(Exception e){
				
			}
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, UName, Password);
			stmt = con.createStatement();
			//To insert the values into table tb1
			String sql1 = "insert into products values(3, \"Heaven\", 8)";
			//To update the data
			int rs1 = stmt.executeUpdate(sql1);
		}
		catch(Exception e1){
			System.out.println(e1);

		}
		
	  }		

          @Test
             public void test(){
               readFromDB();
               writeToDB();
               readFromDB();
 }

	 }


