package JDBC;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class ToExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		//Creating an object of Driver of My SQL vendor
		//Driver dataBaseDriver = new Driver();
		// Registering driver to JDBC API
		//DriverManager.registerDriver(dataBaseDriver);
        //Establishing connection with the database
		//Connection connection = DriverManager.getConnection("");
		// creating statement to pass the select query
		//int result=connection.createStatement().executeUpdate("inset into lead values('Bhupendra','Singh','Qspider'");
		
		 //if(result ==1) {
			 System.out.println("Data has been updated");
		// }
		 //else
			  System.out.println("Database has not been updated");
	          // connection.close();
	  }

}
