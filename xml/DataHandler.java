package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DataHandler extends DefaultHandler {

	private boolean bRollNo=false;
	private boolean bFirstName=false;
	private boolean bLastName=false;
	private boolean bSem1Mark=false;
	private boolean bSem2Mark=false;
	private boolean bSem3Mark=false;
	private boolean bSem4Mark=false;
	private boolean bSem5Mark=false;
	private boolean bSem6Mark=false;
	private double totalMarks=0;
	private int i=1;
	private StringBuilder name = new StringBuilder();
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equalsIgnoreCase("student")) {
			System.out.println("*****************************************************************");
			System.out.println("Student "+i);
			i++;
		}
		
		if(qName.equalsIgnoreCase("rollno")) {
			bRollNo=true;
		}
		else if(qName.equalsIgnoreCase("firstname")) {
			bFirstName=true;
		}
		else if(qName.equalsIgnoreCase("lastname")) {
			bLastName=true;
		}
		else if(qName.equalsIgnoreCase("sem1marks")) {
			bSem1Mark=true;
		}
		else if(qName.equalsIgnoreCase("sem2marks")) {
			bSem2Mark=true;
		}
		else if(qName.equalsIgnoreCase("sem3marks")) {
			bSem3Mark=true;
		}
		else if(qName.equalsIgnoreCase("sem4marks")) {
			bSem4Mark=true;
		}
		else if(qName.equalsIgnoreCase("sem5marks")) {
			bSem5Mark=true;
		}
		else if(qName.equalsIgnoreCase("sem6marks")) {
			bSem6Mark=true;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		if(bRollNo) {
			System.out.println("Roll No : "+ new String(ch,start,length));
			bRollNo=false;
		}
		else if(bFirstName) {
			String fname = new String(ch,start,length);
			name.append(fname).append(" ");
			bFirstName=false;
		}
		else if(bLastName) {
			String lname=new String(ch,start,length);
			name.append(lname);
			System.out.println("Name : "+name);
			bLastName=false;
		}
		else if(bSem1Mark || bSem2Mark || bSem3Mark || bSem4Mark || bSem5Mark || bSem6Mark ) {
			String string = new String(ch,start,length);
			double mark = Double.parseDouble(string);
			totalMarks+=mark;
			
			 bSem1Mark=false;
			 bSem2Mark=false;
			 bSem3Mark=false;
			 bSem4Mark=false;
			 bSem5Mark=false;
			 bSem6Mark=false;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equalsIgnoreCase("student")) {
			double percentage = (totalMarks/600)*100;
			System.out.printf("Percentage : %.2f \n",percentage);
			totalMarks=0.0;
			if(percentage >= 90) {
				System.out.println("Grade : A");
			}
			else if(percentage >= 80 && percentage < 90) {
				System.out.println("Grade : B");			
			}
			else if(percentage >= 70 && percentage < 80) {
				System.out.println("Grade : C");			
			}
			else if(percentage >= 60 && percentage < 70) {
				System.out.println("Grade : D");			
			}
			else if(percentage >= 50 && percentage < 60) {
				System.out.println("Grade : E");			
			}
			else if(percentage >= 40 && percentage < 50) {
				System.out.println("Grade : F");			
			}
			
			name.delete(0, name.length());
			System.out.println("*****************************************************************");
		}
	}
	
}