import java.util.*;
import java.util.Date;
public class Customer {

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", birthdate=" + birthdate
				+ ", averageSpendAmount=" + averageSpendAmount + ", totalAmount=" + totalAmount + ", enrolled="
				+ enrolled + ", rating=" + rating + "]";
	}
	private long id;
	private String name;	
	private String mobileNumber;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date enrolled;
	private Double rating;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((averageSpendAmount == null) ? 0 : averageSpendAmount.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((enrolled == null) ? 0 : enrolled.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((totalAmount == null) ? 0 : totalAmount.hashCode());
		return result;
		
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (averageSpendAmount == null) {
			if (other.averageSpendAmount != null)
				return false;
		} else if (!averageSpendAmount.equals(other.averageSpendAmount))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (enrolled == null) {
			if (other.enrolled != null)
				return false;
		} else if (!enrolled.equals(other.enrolled))
			return false;
		if (id != other.id)
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (totalAmount == null) {
			if (other.totalAmount != null)
				return false;
		} else if (!totalAmount.equals(other.totalAmount))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(Date enrolled) {
		this.enrolled = enrolled;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Customer(long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount,
			double totalAmount, Date enrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.enrolled = enrolled;
		this.rating = rating;
	}
	
	
	
}
