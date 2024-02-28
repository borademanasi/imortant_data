import java.util.*;
public class three_max {
    public static void main(String args[]){
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int no1=sc.nextInt();
        System.out.println("Enter the num2:");
        int no2=sc.nextInt();
        System.out.println("Enter the num3:");
        int no3=sc.nextInt();
        if(no1>no2&&no1>no3)
        {
             System.out.println("The largest number is :"+no1);
        }
       else  if(no2>no1&&no2>no3)
        {
             System.out.println("The largest number is :"+no2);
        }
        else
        {
            System.out.println("The largest number is:"+no3);
        }


    
    }
    



}