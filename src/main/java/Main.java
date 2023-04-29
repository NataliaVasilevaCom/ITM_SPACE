/**
 * @author Natalia Vasileva
 */
public class Main {
    /**
     * Выполнение операции сложения, вычитания, умножения или деления двух чисел
     * @param input введеная пользователем строка
     * @return результат выполнения арифметического выражения
     */
    public static String calc(String input) throws Exception {
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String action = parts[1];
        int output = 0;
        if (a > 0 && a < 11 && b > 0 && b < 11 && parts.length == 3) {
            switch (action) {
                case "+":
                    output = a + b;
                    break;
                case "-":
                    output = a - b;
                    break;
                case "*":
                    output = a * b;
                    break;
                case "/":
                    output = a / b;
                    break;
            }
        } else {
            throw new Exception();
        }
        System.out.println(output);
        return String.valueOf(output);
    }
}
