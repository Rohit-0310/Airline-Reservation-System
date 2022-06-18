import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String id;
	private String email;
	private String name;
	private String contact;
	private String address;
	private int age;
	private String gender;
	private String password;
	
	public List<Integer> numofTickets;
//	public List<Flight> flightRegistered;
	public static List<Customer> customers = UserRunner.getCustomers();
	
	public Customer()
	{
		
	}
	
	public Customer(String id, String email, String name, String contact, 
			String address, int age, String gender,
			String password) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.numofTickets = new ArrayList<>();
//		this.flightRegistered = new ArrayList<>();
	}
	
	
	
	// Getters
	// Setters
	// ToStrings
	
	
	
	
	/**
	 * Add new customer
	 * @param : NA
	 * @return : NA
	 */
	public void addNewCustomer()
	{
		// Take Input from user
		// name , address, email, password, age, address
		
		String name = "X";
		Customer c1 = new Customer("X","Y","name","123","23", 20,"MN","R");
		customers.add(c1);
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", contact=" + contact + ", address="
				+ address + ", age=" + age + ", gender=" + gender + ", password=" + password + ", numofTickets="
				+ numofTickets + "]";
	}

	/**
	 * Search the customer with the given id and prints the data
	 * @param id
	 * return : nothing
	 */
	public void searchUser(String id)
	{
		for(Customer obj: customers)
		{
			if(obj.id==id)
			{
				System.out.println(obj);
			}
		}
	}
	
	
	/**
	 * return true if email id is already registered
	 * @param id
	 * return : nothing
	 */
	public boolean emailUnique(String emailId)
	{
		
	}
	
	
	/**
	 * Delete customer
	 * @param : id
	 * @return : NA
	 */
	public void deleteCustomer(String id)
	{
		
	}
	
	
	/**
	 * Display customer
	 * @param : id
	 * @return : NA
	 */
	public void printCustomer()
	{
		for(Customer c : customers)
		{
			System.out.println(c);
		}
	}
	
	
}