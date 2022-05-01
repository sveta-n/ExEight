import java.util.Scanner;

public class ExEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положиетельное число ");
        int n = scanner.nextInt();

        int total = 0;
        for (int i = 1; i < n; i += 2) {
                total += i;
        }
        System.out.println(total);
    }
}
