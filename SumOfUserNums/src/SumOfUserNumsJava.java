//SumOfUserNums.java
//AJJ 8/19/25
// resources https://www.w3schools.com/java/java_user_input.asp


// Get inputs from user and output the sum of inputs

import java.util.Scanner;

public class SumOfUserNumsJava {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my sum of User");

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int SumOfInts = 1;

        Scanner scanner = new Scanner(System.in);     //create the scanner
        System.out.println("\n Enter Num1 value: ");  // prompt the user
        num1 = scanner.nextInt();                     // collects int from user and overwrites inital variable
        System.out.println("\n num 1 is: " + num1);   // returns the value to the user

        System.out.println("\n Enter Num2 value: ");
        num2 = scanner.nextInt();
        System.out.println("\n num 2 is: " + num2);

        System.out.println("\n Enter Num3 value: ");
        num3 = scanner.nextInt();
        System.out.println("\n num 3 is: " + num3);

//add all three
        SumOfInts = num1 + num2 + num3;

        System.out.println("\n Summ of All Three Inputs:  " +SumOfInts);







    }
}