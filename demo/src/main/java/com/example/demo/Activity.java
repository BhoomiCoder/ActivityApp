package com.example.demo;

import java.time.LocalDate;

public class Activity {

	private int timeSpent;
	private String activityName;
	private LocalDate dateLogged;
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public LocalDate getDateLogged() {
		return dateLogged;
	}
	public void setDateLogged(LocalDate localDate) {
		this.dateLogged = localDate;
	}
	public int getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(int timeSpent) {
		this.timeSpent = timeSpent;
	}
	@Override
	public String toString() {
		return "Activity [timeSpent=" + timeSpent + ", activityName=" + activityName + ", dateLogged=" + dateLogged
				+ "]";
	}
		
}


