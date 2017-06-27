package caseManagementSystem;

/**
 * The Person class is used to create a person with the basic
 * contact information:
 * Help Being Sought, First Name, Last Name, Business Name, Address, Phone Number
 * 
 * @author Jake Michalowicz
 *
 */
public class Person 
{
	private String help, first, last, business, address1, address2, city, state, country, website, number,
	subject, detail, industry, replacment, software, bookSituation, revenue;

	/**
	 * Constructs the person class and initializes all variables
	 * 
	 * @param help What the person is seeking help for
	 * @param first The person's first name
	 * @param last The person's last name
	 * @param business The name of the person's business
	 * @param address1 The first address of the person
	 * @param address2 The second address of the person
	 * @param city The city of the person
	 * @param state The state of the person
	 * @param country The country of the person
	 * @param website The person's website
	 * @param number The person's phone number
	 * @param subject The subject of the person's request
	 * @param detail The detail of the person's request
	 * @param industry The person's industry
	 * @param replacment Y/N if the person's existing Accounting pro must be replaced 
	 * @param software Current accounting software of the person
	 * @param bookSituation How are the person's books done now
	 * @param revenue Current revenue of the person
	 */
	public Person(String help, String first, String last, String business, String address1, 
			String address2, String city, String state, String country, String website, String number,
			String subject, String detail, String industry, String replacment, String software,
			String bookSituation, String revenue)
	{
		this.help = help;
		this.first = first;
		this.last = last;
		this.business = business;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.website = website;
		this.number = number;
		this.subject = subject;
		this.detail = detail;
		this.industry = industry;
		this.replacment = replacment;
		this.software = software;
		this.bookSituation = bookSituation;
		this.revenue = revenue;
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
	 * Gets the person's business name
	 * 
	 * @return the person's business name
	 */
	public String getBusinessName()
	{
		return business;
	}
	
	/**
	 * Gets the person's address1
	 * 
	 * @return the person's address1
	 */
	public String getAddress1()
	{
		return address1;
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
