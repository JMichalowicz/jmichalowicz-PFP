package caseManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CMS 
{
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "test";
	private String driver = "com.mysql.jdbc.Driver";
	private String username = "jmichalowicz";
	private String password = "Vipersnake2";
	public void connect()
	{
		//Connect to a local mySQL database
		try 
		{
			Class.forName(driver).newInstance();
			Connection c = DriverManager.getConnection(url+dbName,username,password);
			Statement st = c.createStatement(); 
			ResultSet res = st.executeQuery("SELECT * FROM people"); 
					
			System.out.println("ID\tName\t\t\tAge");
			while (res.next()) 
			{ 
				int id = res.getInt("id"); 
				String name = res.getString("name"); 
				String age = res.getString("age");
				if(name.length() < 16)
					System.out.println(id + "\t" + name + "\t\t" + age); 
				else
					System.out.println(id + "\t" + name +"\t" + age);
			} 
			c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
