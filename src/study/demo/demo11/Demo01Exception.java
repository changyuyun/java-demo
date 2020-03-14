package study.demo.demo11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
