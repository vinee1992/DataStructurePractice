package com.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExamTest {

	private Map<String , String> m = new HashMap<String , String >();
	
	public void dis() {

		m.put("a", "1");
		m.put("a", "2");
		System.out.println(m.size());
	}
	
	public int s() {
		return m.size();
	}
	
	private void m(List<? extends Number> l) {
		// TODO Auto-generated method stub
		Number n=l.get(0);
	}
	public static void main(String args[]) {
	
		//ExamTest t = new ExamTest();
	//	System.out.println(t.s());
		//ZonedDateTime t= ZonedDateTime.now();
		System.out.println(LocalDate.now().minusMonths(1));
		
		System.err.println(LocalDate.parse("2019-06-12").getDayOfWeek());
		
		System.err.println(LocalDate.parse("2019-06-12").getDayOfMonth());
		
		System.err.println(LocalDate.parse("2019-06-12").isLeapYear());
		
		
		System.err.println(LocalDate.parse("2019-06-12").atStartOfDay());
		
		System.out.println(LocalDate.parse("2019-06-12").with(TemporalAdjusters.firstDayOfMonth()));
		
		System.err.println(LocalTime.MAX);
		
		System.err.println(ZoneId.getAvailableZoneIds());
		
		ZonedDateTime d=ZonedDateTime.now(ZoneId.of("Etc/UTC"));
		DateTimeFormatter f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.GERMANY);
		System.out.println(d.format(f));
		
	}
	
}
