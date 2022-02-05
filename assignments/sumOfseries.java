import java.util.Scanner;

public class sumOfseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        float total = 0;

        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        System.out.println("Sum of Series is: " + total);

        sc.close();
    }
}