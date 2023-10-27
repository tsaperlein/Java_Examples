
import java.util.Scanner;

public class MonthlyDaysFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a month number:");
        int month = input.nextInt();
        System.out.println("Input a year:");
        int year = input.nextInt();

        String monthName = "none";
        int days = 0;

        switch (month) {
            case 1:
            	monthName = "January";
                days = 31;
                break;
            case 2:
            	monthName = "February";
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
            	monthName = "March";
                days = 31;
                break;
            case 4:
            	monthName = "April";
                days = 30;
                break;
            case 5:
            	monthName = "May";
                days = 31;
                break;
            case 6:
            	monthName = "June";
                days = 30;
                break;
            case 7:
            	monthName = "July";
                days = 31;
                break;
            case 8:
            	monthName = "August";
                days = 31;
                break;
            case 9:
            	monthName = "September";
                days = 30;
                break;
            case 10:
            	monthName = "October";
                days = 31;
                break;
            case 11:
            	monthName = "November";
                days = 30;
                break;
            case 12:
            	monthName = "December";
                days = 31;
                break;
        }

        System.out.println("\n" + monthName + " " + year + " has " + days + " days");

        input.close();
    }
}
