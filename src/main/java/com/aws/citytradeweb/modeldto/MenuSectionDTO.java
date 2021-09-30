package com.aws.citytradeweb.modeldto;

import java.util.List;

public class MenuSectionDTO {
	
	private long id;
	private String name;
	private List<ItemDTO> items;
	private VendorDTO vendor;
	
	public MenuSectionDTO() {
		super();
	}
	
	public MenuSectionDTO(String name, List<ItemDTO> items, VendorDTO vendor) {
		super();
		this.name = name;
		this.items = items;
		this.vendor = vendor;
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

	public VendorDTO getVendor() {
		return vendor;
	}

	public void setVendor(VendorDTO vendor) {
		this.vendor = vendor;
	}

public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}	@Override
	public String toString() {
		return "MenuSectionDTO [id=" + id + ", name=" + name + ", items=" + items + ", vendor=" + vendor + "]";
	}

}
