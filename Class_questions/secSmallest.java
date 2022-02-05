import java.util.Scanner;

public class secSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of numbers:");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            System.out.print("enter " + (i + 1) + " Number: ");
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] == min) {
                continue;
            }
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        System.out.println("Second Smallest Number is: " + temp);
        sc.close();
    }
}
