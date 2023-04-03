package subject;

public class Grade {

	private int gradeCode;
	private String gradeName;
	
	public Grade() {
		   this(0);
	}
	
	public Grade(int gradeCode) {
		   this(gradeCode,null);
	}
	
	public Grade(String gradeName) {
		   this(0,gradeName);
	}
	
	public Grade(int gradeCode,String gradeName) {
		
	}
	
	public int getGradeCode() {
		return gradeCode;
	}
	
	public void setGradeCode(int gradeCode) {
		if(gradeCode>=1) {
	       this.gradeCode = gradeCode;
		}
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		if(gradeName!=null) {
			if((gradeName.length()>=1)&&(gradeName.length()<=50)) {
		        this.gradeName = gradeName;
			}
		}
	}
}
