package beans;

public class Address {
	
	private String street;
	
	private String postcode;
	
	public Address() {}
	
	public Address(String street, String postcode) {
		this.postcode = postcode;
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

}
