package com.aws.citytradeweb.modeldto;

import java.util.List;

	public class UserDetailDTO {
		
		private long id;
		private String name;
		private String contactNumber;
		private String emailId;
		private String password;
		private boolean isEnable;
		private String userType;
		private List<AddressDTO> address;
		private List<VendorDTO> favouriteVendor;

		public UserDetailDTO() {
			super();
		}

		public UserDetailDTO(String name, String contactNumber, String emailId, String password, boolean isEnable,
				String userType, List<AddressDTO> address, VendorDTO vendor, List<VendorDTO> favouriteVendor) {
			super();
			this.name = name;
			this.contactNumber = contactNumber;
			this.emailId = emailId;
			this.password = password;
			this.isEnable = isEnable;
			this.userType = userType;
			this.address = address;
			//this.vendor = vendor;
			this.favouriteVendor = favouriteVendor;
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

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isEnable() {
			return isEnable;
		}

		public void setEnable(boolean isEnable) {
			this.isEnable = isEnable;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		
		  public List<VendorDTO> getFavouriteVendor() { return favouriteVendor; }
		 
		  public void setFavouriteVendor(List<VendorDTO> favouriteVendor) {
		  this.favouriteVendor = favouriteVendor; }
		 

		public List<AddressDTO> getAddress() {
			return address;
		}

		public void setAddress(List<AddressDTO> address) {
			this.address = address;
		}

		/*
		 * public VendorDTO getVendor() { return vendor; }
		 * 
		 * public void setVendor(VendorDTO vendor) { this.vendor = vendor; }
		 */

		@Override
		public String toString() {
			return "UserDetail [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", emailId=" + emailId
					+ ", password=" + password + ", isEnable=" + isEnable + ", userType=" + userType + ", address="
					+ address  + "]";
		}	
}
