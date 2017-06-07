package beans;

public class Address {
	
	private String street;
	
	private String postcode;
	
	public Address(String street, String postcode) {
		this.postcode = postcode;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

}
