import java.util.Scanner;

public class HotelRoom {
	String HotelName;
	protected int numberOfSquareFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSquareFeet, boolean hasTV, boolean hasWifi) {
		super();
		HotelName = hotelName;
		this.numberOfSquareFeet = numberOfSquareFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public void calculateTariff() {
		
	}
	
	
}

class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet; 
}


class Demo {
	public static void main(String[] args) {
		System.out.println("Hotel Tariff Calculator");
		System.out.println();
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println();
		System.out.println("Select Room Type: ");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice) {
		case 1 : System.out.println("Hotel Name : ");
		Scanner sc1 = new Scanner(System.in);
		String hname = sc1.nextLine();
		
		System.out.println("Room square feet area  : ");
		Scanner sc2 = new Scanner(System.in);
		int area = sc2.nextint();
		
		System.out.println("TV chahiye? : ");
		Scanner sc3 = new Scanner(System.in);
		String hname = sc3.nextLine();


		
		break;
		}
	}
}