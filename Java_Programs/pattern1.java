import java.util.*;
public class pattern1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            for(int j=i;j<=no;j++){
                System.out.print("&");
            }
            System.out.println("\n");
        }


    }

}