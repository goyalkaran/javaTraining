import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of series: ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=num;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        sc.close();
    }
    
}
