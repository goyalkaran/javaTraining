import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = 0;
        while (num != 0) {
            result = result + (num % 10);
            num = num / 10;
        }

        System.out.println(result);
        sc.close();
    }
}
