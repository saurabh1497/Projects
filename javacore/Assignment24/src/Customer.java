import java.util.Date;
public class Customer implements Comparable<Customer> {
	private long id;
	private String name;
	private String mobilno;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateenrolled;
	private Double rating;
	public Customer() {
		super();
	}
	public Customer(long id, String name, String mobilno, Date birthdate, Double averageSpendAmount, Double totalAmount,
			Date dateenrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobilno = mobilno;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateenrolled = dateenrolled;
		this.rating = rating;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilno() {
		return mobilno;
	}
	public void setMobilno(String mobilno) {
		this.mobilno = mobilno;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}
	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getDateenrolled() {
		return dateenrolled;
	}
	public void setDateenrolled(Date dateenrolled) {
		this.dateenrolled = dateenrolled;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		return " id=" + id + "\n name=" + name + "\n mobilno=" + mobilno + "\n birthdate=" + birthdate
				+ "\n averageSpendAmount=" + averageSpendAmount + "\n totalAmount=" + totalAmount + "\n dateenrolled="
				+ dateenrolled + "\n rating=" + rating + "]";
	}
	
	
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((mobilno == null) ? 0 : mobilno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (mobilno == null) {
			if (other.mobilno != null)
				return false;
		} else if (!mobilno.equals(other.mobilno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Customer arg0) {
		// TODO Auto-generated method stub
		
		
		return name.compareTo(obj.name);
	}
}	
