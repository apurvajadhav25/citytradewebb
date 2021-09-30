package com.aws.citytradeweb.modeldto;


public class CategoryDTO {
  
	private long id;
	private String name;
	private String filterHeading;
	private String imagePath;
	private String catalogueHeading;

	private boolean isEnable;
	// private List<VendorFilterDTO> vendorFilters;
	// private List<FeatureDTO> features;
	// private List<VendorDTO> vendor;
    // private List<MenuSectionDTO> menuSections;


	public CategoryDTO() {
		super();
	}


	public CategoryDTO(String name, String filterHeading,String catalogueHeading, String imagePath, boolean isEnable) {

		super();
		this.name = name;
		this.filterHeading = filterHeading;
		this.imagePath = imagePath;
		this.isEnable = isEnable;
		this.catalogueHeading = catalogueHeading;
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


	public String getFilterHeading() {
		return filterHeading;
	}

	public void setFilterHeading(String filterHeading) {
		this.filterHeading = filterHeading;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	
	/*
	 * public List<VendorFilterDTO> getVendorFilters() { return vendorFilters; }
	 * public void setVendorFilters(List<VendorFilterDTO> vendorFilters) {
	 * this.vendorFilters = vendorFilters; }
	 * 
	 * public List<FeatureDTO> getFeatures() { return features; } public void
	 * setFeatures(List<FeatureDTO> features) { this.features = features; }
	 * 
	 * public List<VendorDTO> getVendor() { return vendor; }
	 * 
	 * public void setVendor(List<VendorDTO> vendor) { this.vendor = vendor; }
	 */

	// public List<MenuSectionDTO> getMenuSections() {
//		return menuSections;
//	}
//	public void setMenuSections(List<MenuSectionDTO> menuSections) {
//		this.menuSections = menuSections;
//	}

	public String getCatalogueHeading() {
		return catalogueHeading;
	}


	public void setCatalogueHeading(String catalogueHeading) {
		this.catalogueHeading = catalogueHeading;
	}


	@Override
	public String toString() {
		return "CategoryDTO [id=" + id + ", name=" + name + ", filterHeading=" + filterHeading + ", imagePath="
				+ imagePath + ", catalogueHeading=" + catalogueHeading + ", isEnable=" + isEnable + "]";
	}


}
