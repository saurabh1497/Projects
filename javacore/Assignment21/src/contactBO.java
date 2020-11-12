import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class contactBO {
	static List <Customer> subCustomer = new ArrayList<>();
	//@SuppressWarnings("unused")
	static Customer createCustomer(String line) {
		String[] details = line.split(",");
		Customer c= new Customer();
		return c;
}
	static List<Customer> findCustomer(List<Customer>customer,String name){
		if(customer.contains(name)) {
		subCustomer.add(customer.get(name));
		}
		else 
			System.out.println("No Customers Found");
		return subCustomer;
	}
	static List<Customer> findCustomer(List<Customer> customer , Date birth){
		if(customer.contains(birth)){
			return subCustomer.add(customer.get(name));
		}
		else
			System.out.println("No Customer Found");
		
	static List<Customer> findCustomer(List<Customer> customer1 , Double rating){
			if(customer1.contains(rating)) {
				return subCustomer.add(customer.get(name));
			}
			else
				System.out.println("Not Found");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
