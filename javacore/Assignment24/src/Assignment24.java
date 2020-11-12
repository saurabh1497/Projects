import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Customer c1 = new Customer(222,"John","9876543210",sdf.parse("12-12-1990"),4000.0,12000.5,sdf.parse("12-12-2017"),3.5);
		Customer c2 = new Customer(111,"Mark","9632587410",sdf.parse("13-01-1992"),3000.0,8000.0,sdf.parse("14-04-2014"),4.0);
		Customer c3 =new Customer(333,"Anil","9874563012",sdf.parse("19-09-2015"),6000.0,5000.0,sdf.parse("16-09-2016"),3.75);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
				
	int choice;
		do {
			System.out.println("Enter type to sort:");
			System.out.println("1.Name\n 2.AmountSpent\n3.Rating\n4.Exit");
			choice = Integer.parseInt(scan.nextLine());
		switch(choice) {
		case 1:
			List<Customer> customerList = new ArrayList<>();
			Collections.sort(customerList);
			for(Customer c : customerList) {
				System.out.println(c);
			}

			break;
			
		case 2:
			Amount amount = new Amount();
			Collections.sort(customerList,amount);
			for(Customer c : customerList) {
				System.out.println(c);
			}
			break;
		case 3:
			Rating rating = new Rating();
			Collections.sort(customerList,rating);
			for(Customer c : customerList) {
				System.out.println(c);
			}
		}
			
			
		}while(choice!=4);
		
	}

}