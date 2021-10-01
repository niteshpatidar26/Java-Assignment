package Reflection;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personId;
	private String personName;
	private int personAge;
	private String personLocation;
	
	public Person() {
		
	}
	
	public Person(int personId, String personName, int personAge, String personLocation) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personLocation = personLocation;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonLocation() {
		return personLocation;
	}

	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}