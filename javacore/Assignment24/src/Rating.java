import java.util.Comparator;

public class Rating implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return   (int) (c1.getRating()-c2.getRating());
	}

}