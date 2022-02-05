import java.util.Scanner;

public class armstrongRange {

    static void armstrong(int num) {
        if(num==1){
            System.out.print(num + " ");
            return;
        }
        if(num<10){
            return;
        }

        int key = num;
        int result = 0;
        int numofDigits = 1 + ((int) Math.log10(num));

        while (num != 0) {
            result = result + (int) Math.pow(num % 10, numofDigits);
            num = num / 10;
        }
        if (result == key) {
            System.out.print(result + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Range Starting from:");
        int start = sc.nextInt();
        System.out.println("Range Ending to:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            armstrong(i);
        }
        System.out.println();
        sc.close();
    }
}
