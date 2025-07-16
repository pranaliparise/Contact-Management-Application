
package com.example.ContactManager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity

public class Contact {
    

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.(com|in|au)$", message = "Please enter a valid email address.")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be numeric only.")
    private String phoneNumber;
    
    
    
 public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Contact(Long id, @NotBlank(message = "First name is required") String firstName,
		@NotBlank(message = "Last name is required") String lastName,
		@NotBlank(message = "Address is required") String address,
		@Email(message = "Please enter a valid email address.") @NotBlank(message = "Email is required") String email,
		@Pattern(regexp = "\\d{10}", message = "Phone number must be numeric only.") String phoneNumber) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.email = email;
	this.phoneNumber = phoneNumber;
}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
