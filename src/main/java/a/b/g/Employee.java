package a.b.g;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Emp_Data")
public class Employee 
{
	@Id@GeneratedValue
	private int id;
	
	@Column(name="First_Name")
	private String fname;
	
	@Column(name="Last_Name")
	private String lname;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Email_ID")
	private String email;
	
	@Column(name="Country")
	private String country;
	
	@Embedded
	private Address a;
	
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
