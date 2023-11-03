package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String city;
	private String land;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String land) {
		super();
		this.street = street;
		this.city = city;
		this.land = land;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", land=" + land + "]";
	}
	
	
}