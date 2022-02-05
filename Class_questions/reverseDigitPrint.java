import java.util.Scanner;

public class reverseDigitPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num: ");
        int num = sc.nextInt();
        int key = num;

        int count = 0;
        while (key != 0) {
            count++;
            key = key / 10;
        }
        int power = count - 1;
        while (num != 0) {
            System.out.println(num / ((int) (Math.pow(10, (power)))));
            num = num % ((int) (Math.pow(10, (power))));
            power--;
        }

        sc.close();
    }
}