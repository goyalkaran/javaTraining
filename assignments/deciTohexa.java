import java.util.Scanner;

public class deciTohexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        char arr[]=new char[100];
        int temp=0;
        int i=0;
        while(num!=0){
            temp=num%16;
            if(temp>=10){
                arr[i]=(char)(temp+55);
                i++;
            }
            else{
                arr[i]=(char)(temp+48);
                i++;
            }
            num=num/16;
        }
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        System.out.println();
        sc.close();
    }

}
