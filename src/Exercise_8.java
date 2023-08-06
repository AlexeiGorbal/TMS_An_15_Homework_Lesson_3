import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to invest: ");
        double a = scanner.nextDouble();
        System.out.print("How long would you like to invest: ");
        int years = scanner.nextInt();
        for (int i = 1; i <= years; i++) {
            double sum = a * 0.1;
            a += sum;
        }
        System.out.println("Your amount: " + a + " by");
    }
}
