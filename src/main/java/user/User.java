package user;

public abstract class User {

	
	private int userCode;
	private String password;
	
	public void setUseCode(int userCode) {
		   if(userCode>=1) {
			   this.userCode=userCode;
		   }
	} 
	
	public int getUserCode() {
		   return userCode;
	}
	
	public void setPassword(String password) {
		   if(password!=null) {
			  this.password=password;
		   }
	}
	
	public String getPassword() {
		   return password;
	}

	
	public abstract String userType();
	
}
