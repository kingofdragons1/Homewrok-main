import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = scanner.nextDouble();

        System.out.println("Введите число b");
        double b = scanner.nextDouble();

        System.out.println("Результат сложения a и b: " + (a + b));
        System.out.println("Результат вычитания a и b: " + (a - b));
        System.out.println("Результат умножения a и b: " + new Multiplier().multiply(a, b));
        System.out.println("Результат деления a и b: " + new Divider().divide(a, b));
    }
}

class Multiplier {
    double multiply(double a, double b) {
        return a * b;
    }
}

class Divider {
    double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
}
