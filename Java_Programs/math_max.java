import java.util.*;
public class math_max {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int no1=sc.nextInt();
        System.out.println("Enter the number2:");
        int no2=sc.nextInt();
        System.out.println("Enter the number3:");
        int no3=sc.nextInt();
        int p=Math.max(no1,Math.max(no2,no3));
        System.out.println(p);


         

    }
    

}