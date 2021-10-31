// Allen Bao
// 10/29/21
// A program that takes the current date and prints the amount of days left in that year. 

/*
 * Input = current date
 * Calculate if it is a leap year and store it in a variable
 * Create switch statement and check what month it is
 * The days left is just based off all the days in the month and every subsequent month
 * Subtract remaining the remaining days of the month
 * Print out to the console
 */

import java.util.Scanner;

public class NumberDaysLeftThisYear {
   public static void main(String[] args) {
      // Create variables to store the date; months as strings, while year and days as ints. 
      String month;
      int day, year;
      
      // Create scanner and get user's input
      Scanner scanner = new Scanner(System.in);
      
      // Input that would break my code would be dates that don't exist or Strings for day and year. 
      System.out.print("Enter a month: ");
      month = scanner.nextLine();
      System.out.print("Enter a day: ");
      day = scanner.nextInt();
      System.out.print("Enter a year: ");
      year = scanner.nextInt();
      
      // Calculate whether or not it is a leap year
      boolean isLeapYear;
      
      // if the year is evenly divisible by 4, continue. Otherwise, it's not a leap year
      if (year % 4 == 0)
          // If the year is evenly divisible by 100, continue. otherwise, it is a leap year. 
          if (year % 100 == 0)
             // if a leap year is divisible by 400, it is a leap year. Otherwise, it is not. 
             if (year % 400 == 0)
                isLeapYear = true;
             else
                isLeapYear = false;
          else
            isLeapYear = true;
      else
         isLeapYear = false;

      // Calculate days left based off month and then subtract the days remaining. 
      int daysLeft = 0; // Initialize this variable to not have an error. 
      
      switch (month) {
         case "December":  // always has 31 days
            daysLeft = 31;
            break; 
         case "November":
            daysLeft = 61;  // always has 30 days
            break;
         case "October":
            daysLeft = 92;  // always has 31 days
            break;
         case "September":
            daysLeft = 122;  // always has 30 days
            break;
         case "August":
            daysLeft = 153;  // always has 31 days
            break;
         case "July":
            daysLeft = 184;  // always has 31 days
            break;
         case "June":
            daysLeft = 214;  // always has 30 days
            break;
         case "May":
            daysLeft = 245;  // always has 31 days
            break;
         case "April":
            daysLeft = 275;  // always has 30 days
            break;
         case "March":
            daysLeft = 306;  // always has 31 days
            break;
         case "February":
            if (isLeapYear)
               daysLeft = 335;  // If leap year February has 29 days
            else
               daysLeft = 334;  // If not leap year February has 28 days
            break;
         case "January":
            if (isLeapYear)
               daysLeft = 366; // Calculate February days
            else
               daysLeft = 365; // January always has 31 days
            break;
      }
      // Repeated line of code; same for every month. 
      daysLeft -= day;
      
      // List the "non" prefix if it is not a leap year. 
      String leapYearString = "non-";
      if (isLeapYear)
         leapYearString = "";
         
      // Remove the "s" in the printed word "days" to make it grammatically accurate.
      String multipleDaysLeft = "s";
      if (daysLeft == 1)
         multipleDaysLeft = "";
         
      // Print the days left and leap year status to the console. 
      System.out.println("There are " + daysLeft + " day" + multipleDaysLeft + " left in the " + leapYearString + "leap year " + year + ".");
   }
}
