package com.aws.citytradeweb.modeldto;

public class EmailDTO {
	private String body;
	private String to;
	public EmailDTO(String body, String to) {
		super();
		this.body = body;
		this.to = to;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

}
