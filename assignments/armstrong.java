import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int key = num;
        int key1 = num;
        int numofDigits = 0;
        double result = 0;
        while (key1 != 0) {
            numofDigits++;
            key1 /= 10;

        }
        while (num != 0) {

            result = result + Math.pow(num % 10, numofDigits);
            num = num / 10;
        }
        if (result == key) {
            System.out.println("ArmStrong Number of " + numofDigits + " Digits.");
        } else {
            System.out.println("Not ArmStrong Number");
        }

        sc.close();
    }
}
