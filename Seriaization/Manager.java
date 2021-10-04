package Seriaization;

import java.io.Serializable;

public class Manager extends Employee implements Serializable
{
	
	private int managerId;
	transient private String empDOB;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}   

}