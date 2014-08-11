package com.cisco.cpg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class OITG {

	private static final String XMLFile = "xml/issues.xml";
	private static final String tplFolder = "templates/";
	private static final String outputFolder = "output/";
	private static final boolean DEBUG = true;

	private ArrayList<Issue> issues;
	
	public static void main(String[] args) {
		OITG o = new OITG();
		o.parseXML();
		o.generate();

	}

	//TODO
	// this is main program logic
	public void generate() {
		if (issues.isEmpty()) {
			return;
		}
		
		this.generateIssueList();
		
		for (Issue i : issues) {
			for (Step s : i.steps) {
				this.generateIssueStep(i.ID, s);
			}
		}
	}
	
	//TODO
	//This is used to parse the XML and store the result in issues.
	public ArrayList<Issue> parseXML() {
		if (this.DEBUG) {
			System.out.println("parseXML() is called to parse the XML file...");
		}
		//TODO
		
		if (this.DEBUG) {
			System.out.println("parseXML() is called to fullfile issues arrayList...");
		}
		return issues;
	}
	
	//TODO
	//This is used to output the index file.
	private void generateIssueList() {
		if (issues.isEmpty())
			return;
		
		if (this.DEBUG) {
			System.out.println("generateIssueList() is called to generate the index file...");
		}
	}
	
	//TODO
	//This is used to output each step.
	private void generateIssueStep(int issueID, Step s) {
		if (this.DEBUG) {
			System.out.println("generateIssueList() is called to generate step file for"
					+ " issue " + issueID + " step " + s.ID);
		}
		//TODO
	}
}
