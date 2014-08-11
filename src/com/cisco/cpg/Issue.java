package com.cisco.cpg;

import java.util.ArrayList;

public class Issue {
	public Integer ID;
	public String name;
	public ArrayList<Step> steps;
	
	public Issue(){}
	
	public Issue(int id) {
		this.ID = id;
	}
}
