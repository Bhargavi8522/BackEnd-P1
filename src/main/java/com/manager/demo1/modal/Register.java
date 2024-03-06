package com.manager.demo1.modal;

import jakarta.persistence.*;

@Entity
// we are creating table 
@Table(name = "User")
public class Register {
	
//  we are a cerating  colonms of table 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name ="phno")
    private long phno;
    
    @Column(name = "address")
    private String address;
    
    
    public Register() {
    	
    }


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
    
//    public Member(String name,String email,String gender,long phno,String options,String address) {
//    	 super();
//    	 
//    	  this.name=name;
//    	  this.email=email;
//    	  this.gender=gender;
//          this.phno=phno;
//          this.options=options;
//          this.address=address; 
//          
//    }

}
