package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    public static LocalDateTime toDate(String dateStr) {

        return LocalDateTime.parse(dateStr, formatter);
    }
}
