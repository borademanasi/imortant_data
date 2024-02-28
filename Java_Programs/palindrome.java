import java.util.*;
public class palindrome {
    public static void main(final String args[]) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to enter");
         int no = sc.nextInt();
        int a = no;
        int rev = 0;

        while (no != 0) {
        int rem = no % 10;// if the number is 131
         rev=rev*10+rem;  //this is the logic ofrev=0, 0*10+1=1 ,rev=1 1*10+3=13,rev=13 13*10+1=131
         no=no/10;

     }
     if(rev==a)
     {
         System.out.println("The given number is palindrome number");
     }
     else{
        System.out.println("The given number is not palindrome number");

     }

}
}