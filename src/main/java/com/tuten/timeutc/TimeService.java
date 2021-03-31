package com.tuten.timeutc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.tuten.timeutc.BeanTime;

@Service
public class TimeService {
	
	BeanTime beanTime;

	public BeanTime getTime(String time) throws ParseException {
		beanTime = new BeanTime();

		SimpleDateFormat f2 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss z");
		f.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = f2.parse(time);

		beanTime.setTime(f.format(date));
		beanTime.setTimezone("UTC");
		return beanTime;
	}

}
