package caseManagementSystem;

/**
 * The Person class is used to create a person with the basic
 * contact information:
 * First name, Last Name, Email, Address, Phone Number
 * 
 * @author Jake Michalowicz
 *
 */
public class Person 
{
	private String first;
	private String last;
	private String email;
	private String address;
	private String number;

	/**
	 * Constructs the Person class
	 * Initializes all instance fields
	 * 
	 * @param first The person's first name
	 * @param last The person's last name
	 * @param email The person's email address
	 * @param address The person's address
	 * @param number The person's phone number
	 */
	public Person(String first, String last, String email, String address, String number)
	{
		this.first = first;
		this.last = last;
		this.email = email;
		this.address = address;
		this.number = number;
	}
	
	/**
	 * Gets the person's first name
	 * 
	 * @return the person's first name
	 */
	public String getFirstName()
	{
		return first;
	}
	
	/**
	 * Gets the person's last name
	 * 
	 * @return the person's last name
	 */
	public String getLastName()
	{
		return last;
	}
	
	/**
	 * Gets the person's email address
	 * 
	 * @return the person's email address
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Gets the person's address
	 * 
	 * @return the person's address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Gets the person's phone number
	 * 
	 * @return the person's phone number
	 */
	public String getNumber()
	{
		return number;
	}
}
