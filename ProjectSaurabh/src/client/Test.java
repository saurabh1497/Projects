package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import book_store.User;
import dao.UserDAO;
import service.UserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	//	Map<Integer,User> createdCustomer = new HashMap<>();
		int choice;
		do {
		System.out.println(" 1.create User\n 2.update user\n 3.Delete User\n 4.get\n 5.ListAll\n 6.Exit");
		System.out.println("Enter your choice: ");
		choice = Integer.parseInt(scan.nextLine());
		switch(choice) {
		
		case 1:
		System.out.println("Enter the number of customers:");
		int noOfCustomers = Integer.parseInt(scan.nextLine());
		for(int i=1;i<=noOfCustomers;i++) {
		System.out.println("Enter Your Details:");
		//scan.nextLine();
		System.out.println("Enter the id:");
		int id = Integer.parseInt(scan.nextLine());
		System.out.println("Enter your fullname:");
		String name = scan.nextLine();
		System.out.println("Enter your email:");
		String email = scan.nextLine();
		System.out.println("Enter the password:");
		String pass = scan.nextLine();
		User u = new User(id,email,name,pass);
		UserService userservice = new UserService(new UserDAO());
		userservice.saveUser(u);
		}
		break;
		case 2:
			System.out.println("Enter the keyid to update:");
			int id = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the new values:");
			System.out.println("Enter your fullname:");
			String name = scan.nextLine();
			System.out.println("Enter your email:");
			String email = scan.nextLine();
			System.out.println("Enter the password:");
			String pass = scan.nextLine();
			User u =new User(id,email,name,pass);
			UserService userservice = new UserService(new UserDAO());
			userservice.updateUser(u);
			break;
			
		case 3:
			System.out.println("Enter the id to be deleted: ");
			int delid = Integer.parseInt(scan.nextLine());
			UserService userservice1 = new UserService(new UserDAO());
			userservice1.deleteUser(delid);
			break;
			
		case 4:
			int gid;
			System.out.println("Enter the id:");
			gid = Integer.parseInt(scan.nextLine());
			UserService userservice2 = new UserService(new UserDAO());
			User u1 = userservice2.getUser(gid);
			System.out.println(u1);
			
			break;
			
		case 5:
			UserService userservice11 = new UserService(new UserDAO()); 
			List<User> cust = new ArrayList<>(userservice11.getAll());
			for(User customers : cust)
				System.out.println(customers);
			break;
			
			
		}
		}while(choice!=6);
		
		
	}

}
