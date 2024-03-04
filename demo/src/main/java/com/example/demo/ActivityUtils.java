package com.example.demo;

import java.util.List;

public class ActivityUtils<T extends Activity> {

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
