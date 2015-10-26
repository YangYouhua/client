/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package net.easyunion.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface Clock {

	static final Clock DEFAULT = new DefaultClock();

	Date getCurrentDate();

	long getCurrentTimeInMillis();

    Date getCurrentMonthFirstDate();

    Date getCurrentMonthLastDate();

    String formatToYYYYmmdd(Date date);
    
    String formatToYYYYmmddWithNoLine(Date date);
    
    long formatToLongTime(Date date);
    
    Date longToDate(long lDate);
    
    // yyyy-MM-dd HH:mm:ss
    String formatToDateTime(Date date);

	/**
	 * 默认时间提供者，返回当前的时间，线程安全。
	 */
	public static class DefaultClock implements Clock {

		@Override
		public Date getCurrentDate() {
			return new Date();
		}

		@Override
		public long getCurrentTimeInMillis() {
			return System.currentTimeMillis();
		}

        public Date getCurrentMonthFirstDate(){
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, -1);
            cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
            return cal.getTime();
        }

        public Date getCurrentMonthLastDate(){
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
            return cal.getTime();
        }

        public String formatToYYYYmmdd(Date date){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            return sf.format(date);
        }
        public String formatToYYYYmmddWithNoLine(Date date){
            SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
            return sf.format(date);
        }

        /* (non-Javadoc)
         * @see net.easyunion.common.util.Clock#formatToDateTime(java.util.Date)
         */
        @Override
        public String formatToDateTime(Date date) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sf.format(date);
        }

        
        /***
         * 日期转换成 201504011211  格式类保存  只需要存储12位，
         */ 
		@Override
		public long formatToLongTime(Date date) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
			return Long.parseLong(sf.format(date));
		}

		/**
		 * 从数据库读取long日期，并转换成Date
		 */
		@Override
		public Date longToDate(long lDate) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
			
			try {
				return sf.parse(String.valueOf(lDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}

}
