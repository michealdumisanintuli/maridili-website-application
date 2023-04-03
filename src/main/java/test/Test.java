package test;

import java.sql.Date;
import java.sql.Time;

import subject.Subject;

public class Test {

	private int code;
	private String name;
	private int total;
	private Subject subject;
	private Date writtenDate;
	private Time writtenTime;
	private Date update;
	private String status;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null) {
			if((name.length()>=1)||(name.length()<=50)) {
		        this.name = name;
			}
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		if(total>=0) {
		   this.total = total;
		}
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		if(subject!=null) {
	    	this.subject = subject;
		}
	}

	public Date getWrittenDate() {
		return writtenDate;
	}

	public void setWrittenDate(Date writtenDate) {
		if(writtenDate!=null) {
	    	this.writtenDate = writtenDate;
		}
	}

	public Time getWrittenTime() {
		return writtenTime;
	}

	public void setWrittenTime(Time writtenTime) {
		if(writtenTime!=null) {
	    	this.writtenTime = writtenTime;
		}
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		if(update!=null) {
		   this.update = update;
		}   
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status!=null) {
			if((status.equalsIgnoreCase("formal"))||(status.equalsIgnoreCase("informal"))) {
		        this.status = status;
			}
		}
	}
	
}
