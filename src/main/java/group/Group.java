package group;

import subject.Subject;

public class Group {

	private int groupCode;
	private Subject subject;
	
	public int getGroupCode() {
		return groupCode;
	}
	
	public void setGroupCode(int groupCode) {
		if(groupCode>=1) {
		   this.groupCode = groupCode;
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
}
