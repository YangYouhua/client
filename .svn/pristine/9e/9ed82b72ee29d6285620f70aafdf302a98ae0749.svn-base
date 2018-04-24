package net.easyunion.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	
	/**
	 * 以date为标准,获取n天前的日期
	 * @param date 基准日期
	 * @param n 天数
	 * @return
	 */
	public static String getDay(Date date,int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -n);
		date = calendar.getTime();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dataStr = df.format(date);
		return dataStr;
	}
	public static String getLongDay(Date date) {
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String dataStr = df.format(date);
		return dataStr;
	}
	public static Date parseDate(String dateStr,String formatStr){
		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDateToString(Date date){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(date);
	}
	
	public static String formatDateToString(Date date, String format){
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(formatDateToString(new Date(), "hhmmsssss"));
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDateTimeToString(Date date){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sf.format(date);
	}
	
	
	public static Date fomatStringToDate(String date,String fomat) throws ParseException{
		SimpleDateFormat sf = new SimpleDateFormat(fomat);
		return sf.parse(date);
	}
	
	/**
	 * 以date为标准，获取月
	 * @param date 基准日期
	 * @param n 天数
	 * @return
	 */
	public static int getMonth(Date date) {
		DateFormat df = new SimpleDateFormat("MM");
		int dataStr = Integer.parseInt(df.format(date));
		return dataStr;
	}
	
	/**
	 * 日期比较
	 * @param DATE1
	 * @param DATE2
	 * @return
	 */
	public static int compare_date(String DATE1, String DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                //System.out.println("DATE1 在 DATE2之后");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                //System.out.println("DATE1 在 DATE2之前");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
	}
	
	 public static int  getMonthLashDay(String date){
		 try{
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
	        Date d = simpleDateFormat.parse(date);
	        Calendar calendar = GregorianCalendar.getInstance();
	        calendar.setTime(d);
	        int lastDay = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	        return lastDay;
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return 30;
	 }
	 
  /**
     * 当月最后一天
     * @return
     */
    public static String lastDayOfMonth(Date date) {
    	 try{
	    	Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.roll(Calendar.DAY_OF_MONTH, -1);
	        return cal.getTime().getDate()+"";
    	 }catch(Exception e){
			 e.printStackTrace();
		 }
        return "31";
    }

		/**
		 * 
		 * @param date
		 * @return
		 */
		public static String formatDateToMonthStr(Date date){
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
			return sf.format(date);
		}
		
		 /**
	     * 获取传入日期的上个月1号
	     * @param date
	     * @param tmp
	     * @return
	     * @throws ParseException
	     */
	    public static String getDiff(Date date,int tmp) throws ParseException {
	        Calendar calendar=Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)+tmp);//让日期加1
	        return formatDate(calendar.getTime()).substring(0,7)+"-01";
	    }
	    
	    /**
	     * @param date
	     * @return yyyy-MM-dd HH:mm:ss
	     */
	    public static String formatDate(Date date){
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        return sdf.format(date);
	    }
	    
		public static String parseDateToStr(Date date,String formatStr){
			SimpleDateFormat sf = new SimpleDateFormat(formatStr);
			String dateStr = null;
			try {
				dateStr = sf.format(date);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dateStr;
		}
}
