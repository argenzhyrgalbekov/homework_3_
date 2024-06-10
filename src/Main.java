import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2, 3, 6, -5, 9, 7, 10, -49, 58, 9, 55, 23, 44, -21, -22};
        boolean drope = false;
        int vol = 0;
        int sum = 0;
        for (double number : numbers) {
            if (number < 0) {
                drope = true;
            }
            if (drope == true && number > 0) {
                vol += 1;
                sum += number;
            }
        }
        System.out.println(sum / vol);
    }
}
