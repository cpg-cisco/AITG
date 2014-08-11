package com.cisco.cpg;

public class StepResult {
	public Integer ID;
	public String name;
	public Integer nextStepID; 
	
	public StepResult(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNextStepID() {
		return nextStepID;
	}

	public void setNextStepID(Integer nextStepID) {
		this.nextStepID = nextStepID;
	}

	public StepResult(int id) {
		this.ID = id;
	}
}
