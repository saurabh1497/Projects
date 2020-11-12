

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Assignment23 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.validate age\n 2.validate name\n 3.Lucky Custome\n 4.Exitr");
		System.out.println("Enter your choice:");
		int choice = Integer.parseInt(scan.nextLine());
		do {
		switch(choice) {
		case 1: 
			System.out.println("Enter your birth date in (dd-MM-yyyy):");
			String d = scan.nextLine();
			SimpleDateFormat sdf =new SimpleDateFormat(d);
				if(Validation.validateAge(sdf.parse(d))) {
					System.out.println("Valid Age");
				}
				else {
					System.out.println("Invalid Age");
				}
				break;
		case 2:
			System.out.println("Enter Your name");
			String name = scan.nextLine();
			if(Validation.validateName(name)) {
				System.out.println("Valid name");
			}
			else {
				System.out.println("Invalid name");
			}
			break;
		case 3:
			System.out.println("Enter your mobile number:");
			String mobnum = scan.nextLine();
			if(Validation.validateMobileNumber(mobnum)) {
				System.out.println("Lucky Customer");
				}
			else {
				System.out.println("Better Luck Next time");
			}
			break;
		case 4:
			break;	
		}
		}while(choice!=4);
	}
	

}