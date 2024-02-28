import java.util.*;
public class switch1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1=sc.nextInt();
        System.out.println("Enter the Seconds number");
        int no2=sc.nextInt();
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:System.out.println("The Addition of two numbers is:"+(no1+no2));
                   break;
            case 2:System.out.println("The Subtraction of two numbers is:"+(no1-no2));
                   break;
            case 3:System.out.println("The Multiplication of two numbers is:"+(no1*no2));
                   break;    
            case 4:System.out.println("The Division of two numbers is:"+(no1/no2));
                   break;
            case 5:System.out.println("The Modulo of two numbers is:"+(no1%no2));
                   break;                  
            default:System.out.println("Invalid Choice");

                   break;
        }


    }

}