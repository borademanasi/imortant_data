import java.util.*;
public class switch4 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number1");
            int no1=sc.nextInt();
            System.out.println("Enter the number2");
            int no2=sc.nextInt();
            System.out.println("Which operations would u want to perdorm?");
        String str=sc.next();
        switch(str){
            case "sum":
            System.out.println(no1+no2);
            break;

            case "sub":
            System.out.println(no1-no2);
            break;

            case "mul":
            System.out.println(no1*no2);
            break;

            case "div":
            if(no2==0){
                System.out.println("not divisible by zero");
            }
            System.out.println(no1/no2);
            break;
        }
            
        }
}