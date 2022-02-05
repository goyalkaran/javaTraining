import java.util.Scanner;

public class rotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num: ");
        int num = sc.nextInt();
        int key=num;

        System.out.print("enter the rotation: ");
        int r = sc.nextInt();
        int count=0;
        while(key!=0){
            count++;
            key/=10;
        }

        int pro=(int)(Math.pow(10,r));
        int sum = num%pro;

        int power2=(int)(Math.pow(10,count-r));
        int result=(sum*power2)+(num/pro);

        System.out.println(result);

        sc.close();
    }
}