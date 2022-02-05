import java.util.Scanner;

public class ifelse {

    static String capital(String name){
        String word[]=name.split(" ");
        
        for(int i=0;i<word.length;i++){
            String first_letter=word[i].substring(0, 1);
            first_letter=first_letter.toUpperCase();

            String rest_letter=word[i].substring(1);
            rest_letter=rest_letter.toLowerCase();

            word[i]=first_letter+ rest_letter+" ";
        }
        name="";
        for(int i=0;i<word.length;i++){
            name+=word[i];
        }
        return name;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter students name: ");
        String name=sc.nextLine();


        System.out.println("enter total num of subjects: ");
        int sub=sc.nextInt();

        int marks[]=new int[sub];

        for(int i=0;i<sub;i++){
            System.out.println("enter subject " +(i+1)+" marks: ");
            marks[i]=sc.nextInt();
        }

        int total_marks=0;
        for(int i=0;i<sub;i++){
            total_marks=total_marks+marks[i];
        }

        int percent_mark=(total_marks/sub);

        System.out.println("\nMarksheet:");
        System.out.println("Name: "+capital(name));
        System.out.println("Marks of "+sub+" Subjects: ");
        for(int i=0;i<sub;i++){
            System.out.println("Subject "+(i+1)+": "+marks[i]);
        }
        System.out.println("Total Marks = "+total_marks);
        System.out.println("Over All Percentage = "+percent_mark+"%");

        if(percent_mark>=90){
            System.out.println("A Grade");
        }
        else if(percent_mark<90 || percent_mark>=80){
            System.out.println("B Grade");
        }
        else if(percent_mark<80 || percent_mark>=70){
            System.out.println("C Grade");
        }
        else if(percent_mark<70 || percent_mark>=60){
            System.out.println("D Grade");
        }
        else{
            System.out.println("E Grade");
        }

        sc.close();
    }
}
