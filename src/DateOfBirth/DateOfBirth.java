/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateOfBirth;

import java.util.Scanner;
   
public class DateOfBirth {

public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int year, month, day;
        // display confidentiality message
        displayMessage();
        // prompt for year of birth
        System.out.print("Please enter the year of your birth: ");        
        // get year from user
        year = sc.nextInt();
        
        // prompt for month of birth
        System.out.print("Please enter the month of your birth as a number from 1 to 12: ");
        // get month from user
        month = sc.nextInt();
        // prompt for day of birth
        
        System.out.print("Please enter the day of your birth as a number from 1 to 31: ");
                // get day from user
        day = sc.nextInt();
        
        System.out.print("Your Date of birth is: " + day + "/" + month + "/" + year + "\n");
}// more code here...

public static void displayMessage(){
        System.out.println("Please note that all information supplied is confidential");
        System.out.println("No personal details will be shared with any third party \n ");
}// enf od displayMessage

    
    
} // end of main