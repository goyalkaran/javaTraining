package shapes;

import java.util.Scanner;

public class wholePyramidInvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the hight of Pyramid: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
