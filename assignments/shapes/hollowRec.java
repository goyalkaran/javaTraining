package shapes;

import java.util.Scanner;

public class hollowRec{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of rec: ");
        int num=sc.nextInt();
        int key=num-2;
        int temp;
        for(int i=0;i<key;i++){
            temp=num;
            if(i==0 || i==key-1) {
                for(int j=0;j<num;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                while(temp-2!=0){
                    System.out.print("  ");
                    temp--;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}