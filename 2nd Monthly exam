import java.util.Scanner;

public class SecondMonthlyExam {

    public static void displayNumbers(int[] numbers) {
        System.out.println("Numbers in the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void searchNumber(int[] numbers, int target) {
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                System.out.println("Number " + target + " FOUND!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number " + target + " NOT found in the array.");
        }
    }

    public static void displayEvenNumbers(int[] numbers) {
        System.out.println("Even numbers only:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        displayNumbers(numbers);

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        searchNumber(numbers, target);

        displayEvenNumbers(numbers);

        scanner.close();
    }
}
