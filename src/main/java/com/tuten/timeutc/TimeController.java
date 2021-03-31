package com.tuten.timeutc;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

	@Autowired
	TimeService timeService;
	
	@PostMapping	  
	@RequestMapping("/time")
	public BeanTime getTime(@RequestBody BeanTime beanTime) throws ParseException{
		return timeService.getTime(beanTime.getTime());
	}
}
