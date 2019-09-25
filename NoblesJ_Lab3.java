//Csc 151 Lab 3
//Jordan Nobles computer engineering 00444118 9/18/19 12:07pm

import java.util.Scanner; //this statement is before the class header

public class NoblesJ_Lab3
{
   public static void main(String[] args) 
   {
// Part A Combined Assignment Operators

   double x = 0.0; // declaring variables
   double y = 9.0;
   double z = 0.6;
   int i = 15; // changed to interger because these numbers aren't double variables anymore
   int j = 15;
   int k = 7;

   x += 5;
   y -= 5;
   z *= 5;
   i /= k;
   j %= k;

   System.out.println(" Part A: " + "\"" + "Combined Assignment Operators" + "\"" + '\n' );
   System.out.println("x = " + x + ", y = " + y + ", z = " + z + '\n' );
   System.out.println("i = " + i + ", J = " + j + '\n');

// Part B Primitive Data Types

   byte byteLow; // Creating 2 variables for each data type: 1 for low and 1 for high
   byte byteHigh;

   byteLow = -128; // value is assigned based of the primitive data type table 
   byteHigh = 127;

   short shortLow;
   short shortHigh;

   shortLow = -32768;
   shortHigh = 32767;
   
   int intLow;
   int intHigh;

   intLow = -2147483648;
   intHigh = 2147483647;

   long longLow;
   long longHigh;

   longLow = -9223372036854775808L;
   longHigh = 9223372036854775807L;

   float floatLow;
   float floatHigh;

   floatLow = -3.4E-38f;
   floatHigh = 3.4E38f;

   double doubleLow;
   double doubleHigh;

   doubleLow = -1.7E-308;
   doubleHigh = 1.7E308;

   boolean booleanTrue; //create two variable for boolean for true and false respectively 
   boolean booleanFalse;

   booleanTrue = true;
   booleanFalse = false;

   char charA; //create 2 variables charA and  CharB
   char charZ;

   charA = 65;  // demostrate that 65_10 when printed as a character Data Type will print as a captial A
   charZ = 90;  // demostrate that 90_10 will print as a captial Z
                // 65_10 in java represents A and 90_10 represents Z

   System.out.println(" Part B: " + "\"" + "Primitive Data Types" + "\"" + '\n' );
   System.out.println("The range of a byte variable is from "
                     + byteLow + " to " + byteHigh);  
   System.out.println("The range of a short variable is from "
                     + shortLow + " to " + shortHigh);  
   System.out.println("The range of a int variable is from "
                     + intLow + " to " + intHigh);  
   System.out.println("The range of a long variable is from "
                     + longLow + " to " + longHigh);  
   System.out.println("The range of a float variable is from "
                     + floatLow + " to " + floatHigh);  
   System.out.println("The range of a double variable is from "
                     + doubleLow + " to " + doubleHigh);                 
   System.out.println("Boolean Data Types can be either be "
                     + booleanTrue + " or " + booleanFalse);                                            
   System.out.println("Uppercase Alphabet runs from "  
                     + charA + " or " + charZ + '\n');                   
                     
// Part C Instantiate and use a Scanner Object
   
   int favNumber; // had to declare favNumber as a integer
   
   Scanner keyboard = new Scanner(System.in); //this creates a scanner object and is
                                             // placed inside the main method
   String first_name = "Jordan "; //define a string to store my first name
   String last_name =  "Nobles"; // define a string to store my last name
   String University = "Hampton University"; // define a string to store my University
   String myFullName = first_name + last_name; //use concacatenator operator to store full name 
   String Fullname_University = myFullName + " attends " + University; //define a new string that says full name attends your school
   
   System.out.println(myFullName); 
   System.out.println(University);
   
   System.out.print("Enter your first name:"); //give a print statement that ask the user to input their full name
   first_name = keyboard.nextLine(); // has the user type in their name
   
   System.out.print("Enter your favorite number:"); //give a print statement that ask the user to input their favorite number
   favNumber = keyboard.nextInt(); //has the user type in their favorite number
   
   System.out.println( "Jordan's favorite number is" + favNumber + '\n'); //prints out a sentence that shows your favorite number
   
   
// Part D String Manipulation

int size; // declare int
char firstLetter, lastLetter; //declare a character



String name = "Jordan Nobles"; // declare string variable
String school = " Hampton University"; // declare string variable

System.out.println( name + " attends " + school);
size = name.length(); //lengh  
String upper = name.toUpperCase(); // uppercase
String lower = name.toLowerCase(); // Lowercase
firstLetter = name.charAt(0); // firstletter
lastLetter = name.charAt(size-1); // lastletter


System.out.println( " My name contains " + size +  " characters including spaces"); 
System.out.println( " My name in uppercase is " + upper);
System.out.println( " My name in lowercase is " + lower);
System.out.println( " My last name begins with " + firstLetter);  
System.out.println( " My last name begins with " + lastLetter);  


   }

}
