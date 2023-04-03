package subject;

public class Subject {

	private String subjectCode;
	private String subjectName;
	private String describe;
	private Grade grade;
	
	public Subject() {
	       this(null);
	}
	
	public Subject(String subjectCode) {
	       this(subjectCode,null);
	}
	
	public Subject(String subjectCode,String subjectName) {
	       this(subjectCode,subjectName,null);
	}
	
	
	public Subject(String subjectCode,String subjectName,String describe) {
	       this(subjectCode,subjectName,describe,null);
	}
	
	public Subject(String subjectCode,String subjectName,String describe,Grade grade) {
		   setSubjectCode(subjectCode);
		   setSubjectName(subjectName);
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}
	
	public void setSubjectCode(String subjectCode) {
		if(subjectCode!=null) {
		   this.subjectCode = subjectCode;
		}
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		if(subjectName!=null) {
		   if((subjectName.length()>=1)&&(subjectName.length()<=50)) {
		       this.subjectName = subjectName;
		   }
		}
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		if(describe!=null) {
			if((describe.length()>=1)&&(describe.length()<=50)) {
		        this.describe = describe;
			}
		}
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		if(grade!=null) {
		   this.grade = grade;
		}
	}
}
