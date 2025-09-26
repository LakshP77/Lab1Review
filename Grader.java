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


// Declare a method called getLetterGrade that takes an integer grade as an argument
// returns the corresponding letter grade from "F" to "A". 
// Use a switch statement to assign an "A" if the grade is 90 or greater, a "B" if the grade is between 80 and 90, and so on. 
// You can assume that the quiz grade is between 0 and 100.

import java.util.Scanner;

public class Grader {

    // Method to convert numeric grade into a letter grade
    public static String getLetterGrade(int score) {
        String letterGrade;

        switch (score / 10) {
            case 10: // handles 100
            case 9:  // 90–99
                letterGrade = "A";
                break;
            case 8:  // 80–89
                letterGrade = "B";
                break;
            case 7:  // 70–79
                letterGrade = "C";
                break;
            case 6:  // 60–69
                letterGrade = "D";
                break;
            default: // 0–59
                letterGrade = "F";
                break;
        }

        return letterGrade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask user for number of grades
        System.out.print("Enter the number of grades you would like to process: ");
        int numGrades = input.nextInt();

        // Step 2: Validate input
        while (numGrades <= 0) {
            System.out.print("Please enter a positive number of grades: ");
            numGrades = input.nextInt();
        }

        // Step 3: Create array to hold grades
        int[] grades = new int[numGrades];

        // Step 4: Prompt for grades
        System.out.println("Enter " + numGrades + " grades separated by spaces:");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = input.nextInt();
        }

        // Step 5: Print grades with letter equivalents
        System.out.println("\nGrades and Letter Grades:");
        for (int i = 0; i < numGrades; i++) {
            System.out.println("Grade: " + grades[i] + " → Letter: " + getLetterGrade(grades[i]));
        }

        input.close();
    }
}
