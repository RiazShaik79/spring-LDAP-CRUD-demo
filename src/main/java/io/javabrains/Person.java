package io.javabrains;

import org.springframework.ldap.odm.annotations.Entry;

@Entry(objectClasses = { "person", "top" }, base="ou=people")
public class Person {
	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Person(String userId, String fullName, String lastName, String description) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.lastName = lastName;
		this.description = description;
	}


	private String userId;
    private String fullName;
    private String lastName;
    private String description;
    
    
    public Person() {}
    
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}