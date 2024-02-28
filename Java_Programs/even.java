import java.util.Scanner; 
public class even {
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number which you want to enter");
           int no=sc.nextInt();
           if(no%2==0)
            System.out.println("The number is even no");
           else 
            System.out.println("The number is odd number ");


       }
}