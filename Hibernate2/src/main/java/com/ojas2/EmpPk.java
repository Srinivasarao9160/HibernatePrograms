package com.ojas2;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable

public class EmpPk  implements Serializable {
	
	private String firstname;
	private String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
