import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
  
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact*=i;
        }
        System.out.println("The factorial :" +fact);              

    }
}
