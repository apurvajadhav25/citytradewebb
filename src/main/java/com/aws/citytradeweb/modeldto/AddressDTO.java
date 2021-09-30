package com.aws.citytradeweb.modeldto;



public class AddressDTO {

	private long id;
	private String pincode;
	private String completeAddress;
	private double latitude;
	private double longitude;
	private String landmark;
	private String addressName;
	private String city;
	private String state;
	private String houseFlatBlock;
	public AddressDTO() {
		super();
	}
	
	public AddressDTO(String pincode, String completeAddress, double latitude, double longitude, String landmark,
			String addressName, String city, String state, String houseFlatBlock) {
		super();
		this.pincode = pincode;
		this.completeAddress = completeAddress;
		this.latitude = latitude;
		this.longitude = longitude;
		this.landmark = landmark;
		this.addressName = addressName;
		this.city = city;
		this.state = state;
		this.houseFlatBlock = houseFlatBlock;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

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

	public String getHouseFlatBlock() {
		return houseFlatBlock;
	}

	public void setHouseFlatBlock(String houseFlatBlock) {
		this.houseFlatBlock = houseFlatBlock;
	}

	@Override
	public String toString() {
		return "AddressDTO [id=" + id + ", pincode=" + pincode + ", completeAddress=" + completeAddress + ", latitude="
				+ latitude + ", longitude=" + longitude + ", landmark=" + landmark + ", addressName=" + addressName
				+ ", city=" + city + ", state=" + state + ", houseFlatBlock=" + houseFlatBlock + "]";
	}

	
	
}
