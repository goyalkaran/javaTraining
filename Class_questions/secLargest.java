import java.util.Scanner;

public class secLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of numbers:");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            System.out.print("enter " + (i + 1) + " Number: ");
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] == max) {
                continue;
            }
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("Second Largest Number is: " + temp);
        sc.close();
    }
}
