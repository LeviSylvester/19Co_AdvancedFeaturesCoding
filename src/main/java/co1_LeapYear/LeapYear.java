package co1_LeapYear;

import java.util.GregorianCalendar;

//# Leap Year
//Write a method that returns true or false depending on wheter its input integer is a leap year or not.
//A leap year is defined as one that is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400.
//Before 1582, Gregorian Calendar doesn't exist and leap year was calculate with Julian Calendar rules :
//A leap year is defined as one that is divisible by 4.
//You can test your implementation with the official GregorianCalendar.isLeapYear() function.
//## Examples
//- 2001: is typical common year
//- 1996: is a leap year
//- 1900: is a typical common year
//- 2000: is an atypical leap year.
//Collapse
public class LeapYear {
    private static boolean isDivByI(int n, int i) {
        return (n % i) == 0;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year > 1582) {
            if (isDivByI(year, 4)) {
                if (!isDivByI(year, 100) || isDivByI(year, 400)) {
                    result = true;
                }
            }
        } else if (year < 1582 && isDivByI(year, 4)) {
            result = true;
        }
        return result;

//        boolean result = false;
//        if (year > 1582) {
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        result = true;
//                    }
//                }
//            } else {
//                result = true;
//            }
//        }
//        return result;


//        if (year%100!=0 && year%400==0) {
//            result = true;
//        } else if (year%4==0 | year<1582 && year%4==0) {
//            result = true;
//        }
////        System.out.println(result);
    }

    public static void main(String[] args) {
//        isLeapYear(1996);
        GregorianCalendar calendar = new GregorianCalendar();
        for (int i = 0; i < 3000; i++) {

            if (isLeapYear(i) != calendar.isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }
}
