import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num: ");
        int num = sc.nextInt();
        int key=num;

        int sum = 0;
        while (num != 0) {
            sum=sum*10+(num%10);
            num=num/10;
        }
        System.out.println(key==sum?"Palindrome Number":"Not Palindrome Number");

        sc.close();
    }
}