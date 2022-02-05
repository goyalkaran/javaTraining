import java.util.Scanner;

public class evenNumSqSum {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1: ");
        int num = sc.nextInt();

        int product = 0;
        int key = num;
        int count=0;
        while(key!=0){
            count++;
            key=key/10;
        }
        if(count%2==0){
            while (num != 0) {
                product = product + (int)(Math.pow((num % 10),2));
                num = num / 100;
            }
        }
        else{
            while (num != 0) {
                num = num / 10;
                product = product + (int)(Math.pow((num % 10),2));

            }
        }
        int sum=0;
        int result=product;
        while(product!=0){
            sum=sum+product%10;
            product/=10;
        }
        System.out.println(result%sum==0?"Lucky num":"NOT");
        // System.out.println(key * product == num2 ? "YES SEED NUMBER" : "NO SEED NUMBER");
        sc.close();
    }
}