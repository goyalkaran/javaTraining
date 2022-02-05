package shapes;

import java.util.Scanner;

public class halfRightPyramid{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of rec: ");
        int num=sc.nextInt();
        
        int j;

        for(int i=0;i<=num;i++){
            j=num-1;
            while(j>=i){
                System.out.print("  ");
                j--;
            }
            for(int t=1;t<=i;t++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}