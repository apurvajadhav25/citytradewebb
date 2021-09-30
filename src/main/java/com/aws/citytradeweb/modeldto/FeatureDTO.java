package com.aws.citytradeweb.modeldto;


public class FeatureDTO {
	
	private long id;
	private String name;
	private CategoryDTO category;
	
	public FeatureDTO() {
		super();
	}

	public FeatureDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Features [id=" + id + ", name=" + name + "]";
	}
	
}
