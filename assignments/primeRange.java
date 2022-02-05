import java.util.Scanner;

public class primeRange {
    static void primeNum(int num) {
        int counter = 0;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Range Starting from:");
        int start = sc.nextInt();
        System.out.println("Range Ending to:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            primeNum(i);
        }
        System.out.println();
        sc.close();
    }
}
