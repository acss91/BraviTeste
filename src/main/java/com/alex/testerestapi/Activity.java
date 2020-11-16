package com.alex.testerestapi;


public class Activity {
	private Long id;
	private String activity;
	private int day_month;
	private int hour_day;
	
	private int time_activity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getDay_month() {
		return day_month;
	}
	public void setDay_month(int day_month) {
		this.day_month = day_month;
	}
	public int getHour_day() {
		return hour_day;
	}
	public void setHour_day(int hour_day) {
		this.hour_day = hour_day;
	}
	
	public int getTime_activity() {
		return time_activity;
	}
	public void setTime_activity(int time_activity) {
		this.time_activity = time_activity;
	}
	
}
