package user;

public class Contact {

	private String phoneNumber;
	private String emailAddress;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		  if(emailAddress!=null) {
			 if((emailAddress.length()>=1)&&(emailAddress.length()<=100)) {
		         this.emailAddress = emailAddress;
			 }
		  }
		  
	}
	
	
	
}
