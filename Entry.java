package com.tts.addressbook;

public class Entry {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

	public Entry(String firstName, String lastName, String phoneNumber, String email) {
		this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Entry() {
    }

    public String getFirstName() {
	    return firstName;
	}

	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}

	public String getLastName() {
	    return lastName;
	}

	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	public String getPhoneNumber() {
	    return phoneNumber;
	}

	public void setPhone(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	@Override
	public String toString(){
		return "First name: " + this.getFirstName() +
				"\nLast name: " + this.getLastName() +
				"\nPhone number: " + this.getPhoneNumber() +
				"\nEmail: " + this.getEmail();
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
	
	}
}
