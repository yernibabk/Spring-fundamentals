package com.pluralsight.util;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar>{
	
	
	private Calendar instance = Calendar.getInstance();

	public Calendar getObject() throws Exception {
		// TODO Auto-generated method stub
		return instance;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Calendar.class;
	}
	
	public void addDays(int num) {
		instance.add(Calendar.DAY_OF_YEAR, num);
	}

}
