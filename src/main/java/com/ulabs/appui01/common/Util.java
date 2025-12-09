/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appui01.common;

import static com.ulabs.appui01.common.Constant.EMPTY;
import static com.ulabs.appui01.common.Constant.FORMAT_DATE;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author manuelguarniz
 */
public class Util {
    public static String formatDate(LocalDateTime datetime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
        return datetime.format(formatter);
    }
    public static String formatDate(LocalDateTime datetime, String dateFormat) {
        dateFormat = EMPTY.equalsIgnoreCase(dateFormat) ? FORMAT_DATE : dateFormat;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return datetime.format(formatter);
    }
    
    public static String ellipsis(String text, int maxShow) {
        return text.length() > maxShow ? text.substring(0, maxShow) + "..." : text;
    }
}
