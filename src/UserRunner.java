import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRunner {

	private static List<Customer> customers = new ArrayList<Customer>();
	public static Customer c1;
	static Scanner sc;
	public static void main(String[] args) {
		
		System.out.println("Welectome");
		c1=new Customer();
		sc = new Scanner(System.in);
		menus();

	}
	public static void  menus() {
		
		System.out.println("Press 1 to add new customer");
		System.out.println("Press 2 to search new customer");
		System.out.println("Press 3 to delete customer");
		System.out.println("Press 4 to display all customer");
		System.out.println("Press 5 to exit");
		System.out.println("Enter your choice");
		
		int choice = sc.nextInt();
		
		if(choice==1) {
			sc.nextLine();
			System.out.println("Enter name: ");
			
			String name=sc.nextLine();
		
			System.out.println("Enter Address: ");
			String address=sc.nextLine();
			
			System.out.println("Enter Contact: ");
			String contact=sc.next();
			
			System.out.println("Enter Gender: ");
			String gender=sc.next();
		
			System.out.println("Enter Password: ");
			String password=sc.next().trim();
			sc.nextLine();
			System.out.println("Enter Email: ");
			String email=sc.next();
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			Customer newCustomer = new Customer(email,name,contact,address,age,gender,password);
				
			c1.addNewCustomer(newCustomer);
			System.out.println("Succes\n\n\n\n\n");
			sc.nextLine();
			System.out.println("DO you want to go to menu?? y/n");
			String out=sc.next();
			if(out.equals("y") || out.equals("yes")) {
				menus();
			}else {
				
			}
	
		}
		
		else if(choice == 2) {
			int cust_id = sc.nextInt();
			c1.searchUser(cust_id);
			menus();
		}else if(choice == 3) {
			System.out.println("Enter ID to deleted");
			int cust_id = sc.nextInt();
			c1.deleteCustomer(cust_id);
			System.out.println("Deleted Successfullly");
			menus();
		}
		
		else if(choice == 4) {
			c1.printCustomer();
			menus();
		}else if(choice==5) {
			sc.close();
			System.out.print("Bye Bye");
		}else {
			System.out.println("Invalid Input");
			menus();
		}
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

}