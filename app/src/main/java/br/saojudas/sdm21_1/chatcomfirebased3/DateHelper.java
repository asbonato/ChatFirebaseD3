package br.saojudas.sdm21_1.chatcomfirebased3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public static String format(Date date){
        return sdf.format(date);
    }
}
