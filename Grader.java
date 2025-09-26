import java.util.Scanner;

public class Grader {

    // Converts numeric grade into a letter grade
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


    // Q1 Answer: It is defined as method overloading, where the methods share the same name, but differ for their parameter list
    // Q2 Answer: The "switch" statement in java cannot work with floating type integers like "double", which aren't fixed values


    // Convert average grade (double) into a letter grade using if-else
    public static String getLetterGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;  // cast to double for decimal precision
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for number of grades
        System.out.print("Enter the number of grades you would like to process: ");
        int numGrades = input.nextInt();

        // Validate input
        while (numGrades <= 0) {
            System.out.print("Please enter a positive number of grades: ");
            numGrades = input.nextInt();
        }

        // Create array to hold grades
        int[] grades = new int[numGrades];

        // Prompt for grades
        System.out.println("Enter " + numGrades + " grades separated by spaces:");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = input.nextInt();
        }

        // Print grades with letter equivalents
        System.out.println("\nGrades and Letter Grades:");
        for (int i = 0; i < numGrades; i++) {
            System.out.println("Grade: " + grades[i] + " → Letter: " + getLetterGrade(grades[i]));
        }

        input.close();
    }
}
