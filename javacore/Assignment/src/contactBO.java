import java.util.ArrayList;
import java.util.List;

public class contactBO {
	//@SuppressWarnings("unused")
	static Customer createCustomer(String line) {
		String[] details = line.split(",");
		Customer c= new Customer();
		return c;
}
	static List<Customer> findCustomer(List<Customer> customer,Customer name){
		List <Customer> subCustomer = new ArrayList<>();
		if(customer.contains(name)) {
		subCustomer.add(name);
		}
		return subCustomer;
	}
}