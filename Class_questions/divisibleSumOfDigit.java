import java.util.Scanner;

public class divisibleSumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num: ");
        int num = sc.nextInt();
        int sum = 0;
        int key = num;

        while (num != 0) {
            sum = sum + (num % 10);

            num = num / 10;
        }
        if (key % sum == 0) {
            System.out.println("YES divisible");
        } else {
            System.out.println("NOT divisible");

        }
        sc.close();
    }
}