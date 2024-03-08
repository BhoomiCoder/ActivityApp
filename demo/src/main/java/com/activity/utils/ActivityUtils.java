package com.activity.utils;

import java.util.List;

import com.activity.model.ActivityLog;
import com.activity.model.AggregatedActivity;

public class ActivityUtils<T extends ActivityLog> {

	public void display(List<? extends T> activity) {
		
		for(T a:activity) {
			if(a instanceof AggregatedActivity) {
				AggregatedActivity aa= (AggregatedActivity)a;
			System.out.println(a.getActivityName()+"----"+aa.getAggregatedTime());
			}
			else {
				System.out.println(a.getActivityName()+"----"+a.getTimeSpent());
			}
		}
	}
}
