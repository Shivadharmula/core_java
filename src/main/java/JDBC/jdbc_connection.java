package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class jdbc_connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;	
		Statement statement=null;
		ResultSet resultset=null;

		 String url="jdbc:mysql://192.168.0.145/codebegun_test";
		 String userName="root";
		 String password="root";
		 String query="select * from cms_info";
		 
		 try
		 {
			 //Class.forName("com.mysql.jdbc.Drivers");
			 connection=DriverManager.getConnection(url, userName, password);
				statement=connection.createStatement();
				resultset=statement.executeQuery(query);
				while(resultset.next())
				{
					System.out.println(resultset.getString("nameoftheparty"));
				
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				connection.close();
				statement.close();
				resultset.close();
				
			}

		}

	}
			
		
