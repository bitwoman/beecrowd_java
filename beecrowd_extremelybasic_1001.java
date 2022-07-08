import java.util.Scanner;

public class beecrowd_extremelybasic_1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1 + number2;

        System.out.println("X = " + sum);

        input.close();
    }
}
