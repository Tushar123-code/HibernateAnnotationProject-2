package a.b.g;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	private String city,state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
