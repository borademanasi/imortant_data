import java.util.*;
public class pattern4 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println("\n");
         }

     }
}