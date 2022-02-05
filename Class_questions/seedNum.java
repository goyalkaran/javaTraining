import java.util.Scanner;

public class seedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1: ");
        int num = sc.nextInt();
        System.out.print("enter the num2: ");
        int num2 = sc.nextInt();
        int product = 1;
        int key = num;

        while (num != 0) {
            product = product * (num % 10);

            num = num / 10;
        }
        System.out.println(key * product == num2 ? "YES SEED NUMBER" : "NO SEED NUMBER");
        sc.close();
    }
}