package problem1and2;

public class User {
		private String userName;
		private String email;
		private String password;
	
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return this.email;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPassword() {
			return this.password;
		}
		public User() {
			this.setUserName("");
			this.setEmail("");
			this.setPassword("");
		}
		public User(String userName, String email, String password) {
			this.setUserName(userName);
			this.setEmail(email);
			this.setPassword(password);
		}
	}
