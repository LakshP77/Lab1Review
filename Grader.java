// Declare a class called Grader. 
// In a main method, prompt the user to enter the number of grades they would like to process. 
// Then, read the number of grades into a variable called numGrades.
// What if the user enters a nonpositive number? Use a loop to validate the user's input. 
// The loop should run as long as numGrades is not positive. 
// In the body of the loop, remind the user to enter a positive number, and then read the user's input into numGrades again.



// Ask the user to enter a series of grades, and store them in an array.
// In the main method, declare an integer array just large enough to store the number of grades 
// which the user wishes to process (numGrades).
// Prompt the user to enter the grades separated by spaces (e.g., 94 75 82).
// In a for loop, read the grades entered by the user and store them in the array.

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of grades you would like to process: ");
        int numGrades = input.nextInt();

        
        while (numGrades <= 0) {
            System.out.print("Please enter a positive number of grades: ");
            numGrades = input.nextInt();
        }

        int[] grades = new int[numGrades];

        System.out.println("Enter " + numGrades + " grades seperated by spaces");

        for (int i = 0, i <= numGrades, i++) {
            grades[i] = input.nextInt();
        }

        System.out.println("You entered: ");
        for (int i = 0, i < numGrades, i++) {
            System.out.println(grades[i] + "");
        }

        // Once validated, confirm the number of grades
        System.out.println("You will be processing " + numGrades + " grades.");

        input.close();
    }
}
