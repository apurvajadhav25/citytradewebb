package com.aws.citytradeweb.modeldto;

import java.time.LocalDateTime;
import java.util.List;

public class VendorDTO {
	
	private long id;
	private String name;
	private String type;
	private String planType;
	private String imagePath;
	private LocalDateTime expiryDate;
	private float rating;
	private String whatsappNumber;
	private String messageNumber;
	private List<FeatureDTO> vendorFeature;
	 
	private List<PaymentDTO> vendorPayment;
	private boolean isEnable;

	private String about;
	private String additionalInformation;
	private UserDetailDTO userDetail;
    private List<TimeSlotDTO> timeSlots;
   // private List<MenuSectionDTO> menuSections;
	//private List<ItemDTO> items;
    private CategoryDTO category;
    private List<VendorFilterDTO> vendorFilter;
	 
	public VendorDTO() {
		super();
	}

	public VendorDTO(String name, String type, String planType, String imagePath, LocalDateTime expiryDate,
			float rating, String whatsappNumber, String messageNumber, List<FeatureDTO> vendorFeature,
			List<PaymentDTO> vendorPayment, boolean isEnable, String about, String additionalInformation,
			UserDetailDTO userDetail, List<TimeSlotDTO> timeSlots, CategoryDTO category,
			List<VendorFilterDTO> vendorFilter) {
		super();
		this.name = name;
		this.type = type;
		this.planType = planType;
		this.imagePath = imagePath;
		this.expiryDate = expiryDate;
		this.rating = rating;
		this.whatsappNumber = whatsappNumber;
		this.messageNumber = messageNumber;
		this.vendorFeature = vendorFeature;
		this.vendorPayment = vendorPayment;
		this.isEnable = isEnable;
		this.about = about;
		this.additionalInformation = additionalInformation;
		this.userDetail = userDetail;
		this.timeSlots = timeSlots;
		this.category = category;
		this.vendorFilter = vendorFilter;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getWhatsappNumber() {
		return whatsappNumber;
	}

	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
	}

	public String getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(String messageNumber) {
		this.messageNumber = messageNumber;
	}

	/*
	 * public String getFeatureId() { return featureId; }
	 * 
	 * public void setFeatureId(String featureId) { this.featureId = featureId; }
	 */
	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public List<FeatureDTO> getVendorFeature() {
		return vendorFeature;
	}

	public void setVendorFeature(List<FeatureDTO> vendorFeature) {
		this.vendorFeature = vendorFeature;
	}

	public List<PaymentDTO> getVendorPayment() {
		return vendorPayment;
	}

	public void setVendorPayment(List<PaymentDTO> vendorPayment) {
		this.vendorPayment = vendorPayment;
	}
	/*
	 * public String getPaymentId() { return paymentId; } public void
	 * setPaymentId(String paymentId) { this.paymentId = paymentId; }
	 */

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public List<TimeSlotDTO> getTimeSlots() {
		return timeSlots;
	}

	public void setTimeSlots(List<TimeSlotDTO> timeSlots) {
		this.timeSlots = timeSlots;
	}

	public UserDetailDTO getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetailDTO userDetail) {
		this.userDetail = userDetail;
	}

	/*
	 * public List<Item> getItems() { return items; }
	 * 
	 * public void setItems(List<Item> items) { this.items = items; }
	 */
	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public List<VendorFilterDTO> getVendorFilter() {
		return vendorFilter;
	}

	public void setVendorFilter(List<VendorFilterDTO> vendorFilter) {
		this.vendorFilter = vendorFilter;
	}

	@Override
	public String toString() {
		return "VendorDTO [id=" + id + ", name=" + name + ", type=" + type + ", planType=" + planType + ", imagePath="
				+ imagePath + ", expiryDate=" + expiryDate + ", rating=" + rating 
				+ ", whatsappNumber=" + whatsappNumber + ", messageNumber=" + messageNumber + ", vendorFeature="
				+ vendorFeature + ", vendorPayment=" + vendorPayment + ", isEnable=" + isEnable + ", about=" + about
				+ ", additionalInformation=" + additionalInformation + ", userDetail=" + userDetail + ", timeSlots="
				+ timeSlots + ", category=" + category + ", vendorFilter=" + vendorFilter + "]";
	}

}
