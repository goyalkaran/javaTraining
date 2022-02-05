
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number: ");
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Prime Number");
        } 
        else {
            System.out.println("Not Prime Number");
        }

        sc.close();
    }
}
