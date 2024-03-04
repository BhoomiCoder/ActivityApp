package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Activity;

@Service
public class ActivityService {

	public int calculateTotalTimeSpent(String name, List<Activity> list) {
		return list.stream().filter(a-> a.getActivityName().equalsIgnoreCase(name)).
				mapToInt(a->a.getTimeSpent()).sum();
	}
}
