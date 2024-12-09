
import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        int numGrades = 10;

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scnr.nextDouble();
            
            sum += grade; 

            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        double average = sum / numGrades;

     
        System.out.println("\nAverage: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);
    }
}

