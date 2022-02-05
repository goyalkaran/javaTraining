import java.util.Scanner;

public class digitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int arr[]=new int[20];
        int i=0;
        while(num!=0){
            arr[i]=num%10;
            i++;
            num=num/10;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
