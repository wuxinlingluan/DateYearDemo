package com.github.dateyeardemo;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.net.ParseException;

import java.util.Date;

/**
 * Created by ${sheldon} on 2018/1/17.
 */

public class DateUtil {
    public static Date strToDate(String style, String date) {
        SimpleDateFormat formatter = new SimpleDateFormat(style);
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String dateToStr(String style, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(style);
        return formatter.format(date);
    }

    public static String clanderTodatetime(Calendar calendar, String style) {
        SimpleDateFormat formatter = new SimpleDateFormat(style);
        return formatter.format(calendar.getTime());
    }

    public static String DateTotime(long date, String style) {
        SimpleDateFormat formatter = new SimpleDateFormat(style);
        return formatter.format(date);
    }
}