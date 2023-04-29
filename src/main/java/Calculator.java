import java.util.Scanner;

/**
 * @author Natalia Vasileva
 */
public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение типа a + b, a - b, a * b, a / b: ");
        String input = scanner.nextLine();
        Main.calc(input);
        scanner.close();
    }
}
