/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class Demo1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.set(2000, Calendar.FEBRUARY, 11);
        String format = "M/d/yyy hh:mm:ss a";
        SimpleDateFormat sdf = 
                new SimpleDateFormat(format);
        System.out.println(sdf.format(today.getTime()));
        
//        Calendar today = Calendar.getInstance();
//        String format = "M/d/yyyy   hh:mm:ss a";
//        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        System.out.println(sdf.format(today.getTime()));
        
//        Date today = new Date();
//        // check oracle website for different formats to use
//        String format = "M/d/yyyy   hh:mm:ss a";
//        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        System.out.println(sdf.format(today));

    }
}
