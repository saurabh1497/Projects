
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Assignment21 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	  //  java.util.Date bDate = sdf.parse("12-12-1990");
	   // java.util.Date eDate =sdf.parse("12-12-2012");
		Customer c1 = new Customer(1,"John","9876543210",sdf.parse("12-12-1990"),5000.0,25000.0,sdf.parse("12-12-2012"),3.0 );
		Customer c2 =new Customer(2, "John", "9876543210",sdf.parse ("12-12-1990"), 8000.0, 28000.0,sdf.parse("12-11-2012"), 3.5 );
		System.out.println(c1+"\n\n");
		System.out.println(c2);
		
		if(c1.equals(c2)) {
			System.out.println("\nCustomer 1 is same as Customer 2");
		}
		
	}
	

}