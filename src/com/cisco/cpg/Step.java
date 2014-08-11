package com.cisco.cpg;

import java.util.ArrayList;

public class Step {
	public Integer ID;
	private String name;
	private String instruction;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public ArrayList<StepResult> results;
	
	public Step() {}
	
	public Step(int id) {
		this.ID = id;
	}
}
