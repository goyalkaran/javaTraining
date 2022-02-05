package shapes;

import java.util.Scanner;

public class halfRightPyramidInverse{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for side: ");
        int num=sc.nextInt();
        
        int j;

        for(int i=1;i<=num;i++){
            j=1;
            while(j<i){
                System.out.print("  ");
                j++;
            }
            for(int t=i;t<=num;t++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}