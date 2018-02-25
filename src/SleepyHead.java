//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
         
        
   
int day = JOptionPane.showConfirmDialog(null, "is it a weekday?");

        if (day==0) {
        System.out.println("get up lazybones!");
        }
        if (day==1) {
            System.out.println("sleep in");
            }


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
