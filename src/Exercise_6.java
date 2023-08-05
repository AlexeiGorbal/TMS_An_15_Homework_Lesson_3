import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char quotes = 34;
        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        System.out.println("Entered word: " + quotes + str + quotes);
    }
}
