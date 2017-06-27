package caseManagementSystem;

import java.sql.*;

/**
 * Establishes a connection to a mySQL database
 * 
 * @author Jake Michalowicz
 *
 */
public class CMSRunner 
{
	public static void main(String[] args)
	{
		CMS pfp = new CMS();
		pfp.connect();
	}
}
