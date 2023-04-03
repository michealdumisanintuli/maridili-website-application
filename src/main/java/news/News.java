package news;

import java.sql.Date;
import java.sql.Time;

import user.Teacher;

public class News {

	private int newsCode;
	private String title;
	private String describe;
	private Date date;
	private Time time;
	private Teacher teacher;
	
	
	public News() {
		   this(0);
	}
	
	
	public News(int newsCode) {
		   setNewsCode(newsCode);
	}
	
	public int getNewsCode() {
		return newsCode;
	}
	
	public void setNewsCode(int newsCode) {
		this.newsCode = newsCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		if(describe!=null) {
			if((describe.length()>=1)&&(describe.length()<=2500)) {
		        this.describe = describe;
			}
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


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		if(teacher!=null) {
		    this.teacher = teacher;
		}
	}
}
