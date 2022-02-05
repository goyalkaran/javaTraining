import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of n: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + "x" + i + " = " + (i * j) + ", ");
            }
            System.out.println();
        }

        sc.close();
    }
}
