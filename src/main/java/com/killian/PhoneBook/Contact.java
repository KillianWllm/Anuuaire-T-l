package com.killian.PhoneBook;

public class Contact {
	
	private String lastName;
	private String firstName ;
	private String userOld;
	
	private String phoneNumber;
	
	public Contact(String lastName, String firstName, String phoneNumber, String userOld ) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.userOld = userOld;
		
	}
	
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserOld() {
		return userOld;
	}

	public void setUserOld(String userOld) {
		this.userOld = userOld;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Contact enregistrer :" + " " + this.firstName + " " + this.lastName + " " + this.userOld + " ans " + this.phoneNumber;
	}
}
