import java.util.Scanner;
public class SEATWORK1_SEM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many grades? (1 to 5) ");
        int numGrades = scanner.nextInt();
        
        while(numGrades < 1 || numGrades > 5) {
            System.out.println("Invalid input! Please enter between 1-5.");
            System.out.print("How many grades? (1 to 5) ");
            numGrades = scanner.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            
            while(grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Please enter between 0-100.");
                System.out.print("Enter grade " + (i + 1) + ": ");
                grade = scanner.nextDouble();
            }
            sum += grade;
        }        

        double average = sum / numGrades;
        System.out.printf("Average: %.2f%n", average);
        
        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }       
        
        System.out.println("Letter grade: " + letterGrade);
        scanner.close();
        System.out.println("Thank you!");
    }
}
