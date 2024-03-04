package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.Activity;
import com.example.demo.ActivityUtils;
import com.example.demo.AggregatedActivity;

@ExtendWith(MockitoExtension.class)
public class ActivityServiceTest {

	@Test
	public void testCalculator() {
		ActivityUtils<Activity> au = new ActivityUtils<>();
		
		ActivityService activityService= new ActivityService();
		
		List<Activity> activityList= new ArrayList<>();
		
		activityList.add(createActivity("painting", LocalDate.now(), 30));
		activityList.add(createActivity("Yoga", LocalDate.now(), 40));
		activityList.add(createActivity("Reading", LocalDate.now(), 33));
		
		activityList.add(createActivity("painting", LocalDate.now().minusDays(1), 30));
		activityList.add(createActivity("Yoga", LocalDate.now().minusDays(1), 34));
		activityList.add(createActivity("Reading", LocalDate.now().minusDays(1), 38));
		
		activityList.add(createActivity("painting", LocalDate.now().minusDays(2), 31));
		activityList.add(createActivity("Yoga", LocalDate.now().minusDays(2), 34));
		activityList.add(createActivity("Reading", LocalDate.now().minusDays(2), 36));
		
		au.display(activityList);
		
		AggregatedActivity aa = new AggregatedActivity();
		List<AggregatedActivity> aaList = new ArrayList<>();
		aa.setActivityName("Painting");
		aa.setAggregatedTime(activityService.calculateTotalTimeSpent("Painting",activityList));
		AggregatedActivity aa1 = new AggregatedActivity();
		aa1.setActivityName("Yoga");
		aa1.setAggregatedTime(activityService.calculateTotalTimeSpent("Yoga",activityList));
		AggregatedActivity aa2 = new AggregatedActivity();
		aa2.setActivityName("Reading");
		aa2.setAggregatedTime(activityService.calculateTotalTimeSpent("Reading",activityList));
		
		aaList.add(aa);
		aaList.add(aa1);
		aaList.add(aa2);
		Collections.sort(aaList);
		assertEquals("Yoga", aaList.get(0).getActivityName());
		assertEquals(108, aaList.get(0).getAggregatedTime());
		au.display(aaList);
	}
	
	private static Activity createActivity(String name, LocalDate date, int time) {
		Activity a1= new Activity();
		a1.setActivityName(name);
		a1.setDateLogged(date);
		a1.setTimeSpent(time);
		return a1;
	}
	
}
