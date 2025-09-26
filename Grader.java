// Declare a class called Grader. 
// In a main method, prompt the user to enter the number of grades they would like to process. 
// Then, read the number of grades into a variable called numGrades.
// What if the user enters a nonpositive number? Use a loop to validate the user's input. 
// The loop should run as long as numGrades is not positive. 
// In the body of the loop, remind the user to enter a positive number, and then read the user's input into numGrades again.


public class Grader {
    System.out.println("Enter the # of grades you want: ");
    int numGrades = input.nextInt();

    while (numGrades <= 0) {
        System.out.println("Please enter a postive # of grades: ");
        numGrades = input.nextInt()
    }

    System.out.println("You will be processing " + numGrades + " grades. ")

    
}