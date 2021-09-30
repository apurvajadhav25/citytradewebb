package com.aws.citytradeweb.modeldto;

public class PaymentDTO {

	private long id;
	private String method;

	public PaymentDTO() {
		super();
	}

	public PaymentDTO(long id, String method) {
		super();
		this.id = id;
		this.method = method;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", method=" + method + "]";
	}

}
