package shapes;

import java.util.Scanner;

public class solidRec{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of rec: ");
        int num=sc.nextInt();
      
        for(int i=0;i<num-2;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}