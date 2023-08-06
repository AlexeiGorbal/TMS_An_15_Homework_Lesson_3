import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double numberOne = scanner.nextInt();
        System.out.println("Enter the second number: ");
        double numberTwo = scanner.nextInt();
        double difference;
        double divisionOne;
        double divisionTwo;
        if (numberOne - numberTwo == 0) {
            System.out.println("You entered two identical numbers.");
        } else {
            while (numberOne - numberTwo != 0) {
                if (numberOne > numberTwo) {
                    difference = numberOne - numberTwo;
                } else {
                    difference = numberTwo - numberOne;
                }
                divisionOne = numberOne / difference;
                divisionTwo = numberTwo / difference;
                if (divisionOne % 2 > 0 || divisionTwo % 2 > 0) {
                    if (numberOne > numberTwo) {
                        numberOne = difference;
                    } else if (numberOne < numberTwo) {
                        numberTwo = difference;
                    }
                }
            }
        }
    }
}
