package problem1and2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Security {
	
	  User[] users = new User[20];
	   int totalUsers = 0;

	   public void loadUsers(String fileName) {

		   try {
			   Scanner inFile = new Scanner(new FileReader(fileName));
			   inFile.nextLine();
			   
	            while (inFile.hasNextLine() && totalUsers < users.length) {
	            	String line = inFile.nextLine();
	            	String[] fields = line.split(",");
	            	users[totalUsers] = new User();
	            	users[totalUsers].setUserName(fields[0]);
	            	users[totalUsers].setEmail(fields[1]);
	                users[totalUsers].setPassword(fields[2]);

	                totalUsers++;
	            }

	            inFile.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("ERROR: File not found.");
	            System.out.println(e);
	        }
	    }

	public void showUsers() {
		
		int index;
		
		System.out.printf("%-14s %-17s %s%n","UserName", "Password", "Email");
		System.out.printf("%-14s %-17s %s%n","--------", "--------", "-----");
		
		for(index=0;index<users.length;index++) {
			System.out.printf("%-15s%-18s%s\n", users[index].getUserName(), users[index].getPassword(), users[index].getEmail());
		}
	}
}
		
