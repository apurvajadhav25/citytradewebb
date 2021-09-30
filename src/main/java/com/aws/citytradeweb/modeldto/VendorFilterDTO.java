package com.aws.citytradeweb.modeldto;

public class VendorFilterDTO {
	
	private long id;
	private String name;
	private int type;
	private String imagePath;
	private CategoryDTO category;
	
	public VendorFilterDTO() {
		super();
	}

	public VendorFilterDTO(String name, int type, String imagePath, CategoryDTO category) {
		super();
		this.name = name;
		this.type = type;
		this.imagePath = imagePath;
		this.category = category;
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
	

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "VendorFilterDTO [id=" + id + ", name=" + name + ", type=" + type + ", imagePath=" + imagePath
				+ ", category=" + category + "]";
	}

}
