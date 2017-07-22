package com.cssrc.simplefactest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class testdes {
	
	Locale locale = Locale.FRENCH;
    Date date = new Date();
    String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
	
}
