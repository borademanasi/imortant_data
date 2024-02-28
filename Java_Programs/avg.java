import java.util.Scanner;

public class avg {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number one");
    int no1=sc.nextInt();
    System.out.println("Enter the number two");
     int no2=sc.nextInt();
    System.out.println("Enter the number three");
    int no3=sc.nextInt();
    int d=no1+no2+no3;
    int e=d/3;
    System.out.println("The average is "+e ); 
    }



}