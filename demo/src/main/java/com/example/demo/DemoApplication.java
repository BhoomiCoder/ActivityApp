package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activity.model.ActivityLog;
import com.activity.service.ActivityService;
import com.activity.utils.ActivityUtils;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ActivityUtils<ActivityLog> au = new ActivityUtils<>();


		SpringApplication.run(DemoApplication.class, args);
	}






}
