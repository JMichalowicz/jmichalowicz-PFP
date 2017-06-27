package caseManagementSystem;

import java.sql.*;

public class SoftwareRunner 
{
	private static String url = "jdbc:mysql://localhost:3306/";
	private static String dbName = "test";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String username = "jmichalowicz";
	private static String password = "Vipersnake2";
	public static void main(String[] args)
	{
		//Connect to a local mySQL database
		try 
		{
			Class.forName(driver).newInstance();
			Connection c = DriverManager.getConnection(url+dbName,username,password);
			Statement st = c.createStatement(); 
			ResultSet res = st.executeQuery("SELECT * FROM people"); 
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
