// Allen Bao
// 10/29/21
// A program that takes the current date and prints the amount of days left in that year. 

import java.util.Scanner;

public class NumberDaysLeftThisYearCleanVersion {
   public static void main(String[] args) {
      // Create variables to store the date; months as strings, while year and days as ints. 
      String month;
      int day, year;
      
      // Create scanner and get user's input
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a day: ");
      day = scanner.nextInt();
      // add the below statement to move the cursor position to the next line. 
      scanner.nextLine();
      System.out.print("Enter a month: ");
      month = scanner.nextLine();
      System.out.print("Enter a year: ");
      year = scanner.nextInt();
      
      
      
      
   }
   
   // method that takes a year and returns whether it is a leap year or not.
   public boolean isLeapYear(int year) {
     // if the year is evenly divisible by 4, continue. Otherwise, it's not a leap year
     if (year % 4 == 0) {
         // If the year is evenly divisible by 100, continue. otherwise, it is a leap year. 
         if (year % 100 == 0) {
            // if a leap year is divisible by 400, it is a leap year. Otherwise, it is not. 
            if (year % 400 == 0){
               return true;
            }
            return false;         
         }
         return true;
     } 
     return false;
   }
   
   public int monthAsInt(String month) {
      switch (month) {
         // Returns the month as an int from string input.
         case "January":
            return 1;
         case "February":
            return 2;
         case "March":
            return 3;
         case "April":
            return 4;
         case "May":
            return 5;
         case "June":
            return 6;
         case "July":
            return 7;
         case "August":
            return 8;
         case "September":
            return 9;
         case "October":
            return 10;
         case "November":
            return 11;
         case "December":
            return 12;
         default: // Invalid input
            return 0;
      }
   }
}