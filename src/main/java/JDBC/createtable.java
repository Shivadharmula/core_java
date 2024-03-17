package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Statement;

public class createtable {
 
	  String url="jdbc:mysql://192.168.0.116/codebegun_test";
	  String userName="root";
	  String password="root";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
           Connection connection = null;
           Statement statement =null;
           try
  		 {
  			 //Class.forName("com.mysql.jdbc.Drivers");
  	//		 connection  =DriverManager.getConnection(url,userName, password);
  		//	 System.out.println("");
  				statement  =connection.createStatement();
  				
  				{
  					String sql=" create table registration" +
  				             "(id int not null," +
  							"  firstname varchar(200),"  +
  				             " lastname varchar (100)," +
  							" age INTEGER," +
  				             "mobile number bigint not null" +
  							"primary key (id))";
  							
  				//	statement.excuteUpdate(sql);
  				}
  				
  				System.out.println("Created table in given databse");
  		 }
//  			catch(Exception e)
//  			{
//  				e.printStackTrace();
//  			}
     			finally {
  				connection.close();
  				statement.close();
//  			//	resultset.close();
  				  			}
 
  		 
	}

}
