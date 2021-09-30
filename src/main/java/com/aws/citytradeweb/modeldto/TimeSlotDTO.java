package com.aws.citytradeweb.modeldto;

public class TimeSlotDTO {

	private long id;
	private String startTime;
	private String endTime;
	//private VendorDTO vendor;
	public TimeSlotDTO() {
		super();
	}

	public TimeSlotDTO(String startTime, String endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "TimeSlotDTO [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
