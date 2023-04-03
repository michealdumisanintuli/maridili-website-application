package message;

import java.sql.Date;
import java.sql.Time;

import group.Group;
import user.User;

public class Message {

	private int messageCode;
	private String details;
	private User user;
	private Group group;
	private Date date;
	private Time time;
	
	public Message() {
		   this(0);
	}
	
	public Message(int messageCode) {
		   setMessageCode(messageCode);
	} 
	
	public int getMessageCode() {
		return messageCode;
	}
	
	public void setMessageCode(int messageCode) {
		if(messageCode>=1) {
		   this.messageCode = messageCode;
		}
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		if(details!=null) {
			if((details.length()>=1)&&(details.length()<=1)) {
		        this.details = details;
			}
		}
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		if(user!=null) {
		   this.user = user;
		}
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		if(group!=null) {
		   this.group = group;
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		if(date!=null) {
		   this.date = date;
		}
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		if(time!=null) {
		   this.time = time;
		}
	}

}
