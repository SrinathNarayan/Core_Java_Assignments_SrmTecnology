package Day6_7_Assignments;

import java.beans.Statement;
import java.io.IOException;
import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
public class EpmDatabase {
	
	   public static void main(String[] args) {
	      Thread thread = new Thread();
	      thread.start();
	      System.out.println("current running thread: "+Thread.currentThread().getName());
	   }

	   public void run() throws SQLException{
	      Connection conn = null;
	      Statement stmt = null;
	      try {
	         try {
	            Class.forName("com.mysql.jdbc.Driver");
	         } catch (Exception e) {
	            System.out.println(e);
	      }
	      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd", "root", "Mq.l#5g5r@011");
	      System.out.println("Connection is created successfully:");
	      stmt = (Statement) ((java.sql.Connection) conn).createStatement();
	      String query1 = "INSERT INTO Employee " + "VALUES ('103', 'kirsh', ' Android Developer', 'China',789456123,'zzz@gmail.com',18)";
	      ((java.sql.Statement) stmt).executeUpdate(query1);
	      query1 = "INSERT INTO Employee " + "VALUES ('102', 'Ram', 'Java Developer', 'India',123456789,'123@gmail',40)";
	      ((java.sql.Statement) stmt).executeUpdate(query1);
	      System.out.println("Record is inserted in the table successfully..................");
	      } catch (SQLException excep) {
	         excep.printStackTrace();
	      } catch (Exception excep) {
	         excep.printStackTrace();
	      } finally {
	         if (stmt != null)
				try {
					conn.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         if (conn != null)
				try {
					conn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	      }
	      System.out.println("Table is  Printed");
	   }
	}



