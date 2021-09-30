package com.aws.citytradeweb.modeldto;


public class ItemDTO {

	private long id;
	private String name;
	private String type;
	private long price;
	private float rating;
	private String productDetail;
	private String primaryImage;
	private String secondaryImage;
	private String details;
	private int isAvailable;	
	private String descriptions;
//	private MenuSectionDTO menuSection;
	 
	public ItemDTO() {
		super();
	}

	public ItemDTO(String name, String type, long price, float rating, String productDetail, String primaryImage,
			String secondaryImage, String details, int isAvailable, String descriptions) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.rating = rating;
		this.productDetail = productDetail;
		this.primaryImage = primaryImage;
		this.secondaryImage = secondaryImage;
		this.details = details;
		this.isAvailable = isAvailable;
		this.descriptions = descriptions;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public String getPrimaryImage() {
		return primaryImage;
	}

	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}

	public String getSecondaryImage() {
		return secondaryImage;
	}

	public void setSecondaryImage(String secondaryImage) {
		this.secondaryImage = secondaryImage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

//	public MenuSectionDTO getMenuSection() {
//		return menuSection;
//	}
//
//	public void setMenuSection(MenuSectionDTO menuSection) {
//		this.menuSection = menuSection;
//	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", rating=" + rating
				+ ", productDetail=" + productDetail + ", primaryImage=" + primaryImage + ", secondaryImage="
				+ secondaryImage + ", details=" + details + ", isAvailable=" + isAvailable + ", descriptions="
				+ descriptions + "]";
	}
}
