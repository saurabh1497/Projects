import java.util.Comparator;

public class Amount implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		
		return (int) (c1.getAverageSpendAmount()-c2.getAverageSpendAmount());
	}

}