import java.util.Scanner;

public class deciTobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int temp = 0;
        int i = 1;
        while (num != 0) {
            temp = temp + (num % 2) * i;
            num = num / 2;
            i = i * 10;
        }
        System.out.println(temp);
        sc.close();
    }

}
