package shapes;

import java.util.Scanner;

public class halfLeftPyramidInverse{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of rec: ");
        int num=sc.nextInt();
        int j;
        for(int i=0;i<=num;i++){
            j=num;

            while(j!=i){
                    System.out.print("* ");
                    j--;
            }
            System.out.println();
        }
        sc.close();
    }
}