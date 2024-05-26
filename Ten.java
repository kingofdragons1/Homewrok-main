import java.util.stream.LongStream;

public class Ten {
    public static void main(String[] args) {
        int a = 10000000;
        int b = 1000000000;

        long sum = getArithmeticProgressionSum(a, b);
        System.out.println("Сумма чисел между " + a + " и " + b + ": " + sum);
    }

    public static long getArithmeticProgressionSum(int a, int b) {
        // Используем LongStream.rangeClosed для создания потока чисел от a до b (включительно)
        // Затем суммируем все числа в потоке
        return LongStream.rangeClosed(a, b - 1).sum();
    }
}
