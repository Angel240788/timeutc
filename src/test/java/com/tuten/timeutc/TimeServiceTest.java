package com.tuten.timeutc;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class TimeServiceTest {

	@Test
	public void getTimeTest() throws ParseException {
		TimeService timeService = new TimeService();
		timeService.getTime("14:15:44");
	}

}
