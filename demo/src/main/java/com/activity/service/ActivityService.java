package com.activity.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.activity.model.Activity;
import com.activity.model.ActivityLog;

@Service
public class ActivityService {
	
	
	public void createActivity(String name)
	{
		Activity activity=new Activity();
		activity.setName(name);
		
		// TODO Call DAO and save to database
	}
	
	public void createLog(LocalDate date,int timeSpent,String name)
	{
		ActivityLog activity=new ActivityLog();
		activity.setActivityName(name);
		activity.setTimeSpent(timeSpent);
		activity.setDateLogged(date);
		
		// TODO Call DAO and save to database
	}
	
	public List<ActivityLog> retrieveSortedActivity(LocalDate startDate,LocalDate endDate)
	{
		//Call DAO and retrieve for date range
		
		// Use below method to sort based on time spent
		
		return new ArrayList<>();
	}


	public int calculateTotalTimeSpent(String name, List<ActivityLog> list) {
		return list.stream().filter(a-> a.getActivityName().equalsIgnoreCase(name)).
				mapToInt(a->a.getTimeSpent()).sum();
	}
	
	
}
