import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the length of gp: ");
        int num=sc.nextInt();

        System.out.print("enter a in gp: ");
        float a=sc.nextFloat();

        System.out.print("enter r in gp: ");
        float r=sc.nextFloat();
        float y=1;

        for(int i=0;i<num;i++){
            System.out.print(a*y+" ");
            y=y*r;
        }
        
        System.out.println();
        sc.close();
    }
    
}
