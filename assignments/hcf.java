import java.util.Scanner;

public class hcf {

    static String primefac(int num1) {
        String ar = "";
        int i = 2;

        while (i <= num1) {
            if (num1 % i == 0) {
                ar = ar + i;
                num1 = num1 / i;
            } else {
                i++;
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        String ar1=primefac(num1);
        
        System.out.print("Enter Second num: ");
        int num2 = sc.nextInt();
        String ar2=primefac(num2);

        int i=ar1.length();
        int j=ar2.length();
        int t=0,k=0;
        int result=1;
        while(t<i && k<j){
            if(ar1.charAt(t)==ar2.charAt(k)){
                result= result*Integer);
                t++;
                k++;
            }
            else if(ar1.charAt(t)>ar2.charAt(k)){
                k++;
            }
            else{
                t++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
