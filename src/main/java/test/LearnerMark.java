package test;

import user.Learner;

public class LearnerMark {
    
	private Learner learner;
	private int total;
	private Test test;
	
	public Learner getLearner() {
		return learner;
	}
	
	public void setLearner(Learner learner) {
		if(learner!=null) {
		   this.learner = learner;
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		if(total>=1) {
		   this.total = total;
		}
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		if(test!=null) {
		   this.test = test;
		}
	}
	
	
}
