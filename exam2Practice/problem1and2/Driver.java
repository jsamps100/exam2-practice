package problem1and2;

public class Driver {
	
	public static void main(String[] args) {
		
		Security userList = new Security();
		userList.loadUsers("users.txt");
		userList.showUsers();
	}
}
