import java.util.*;
public class pattern5 {

    public static void main(String args[]){    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no;j++){
                System.out.print("@");
            }
            System.out.print("\n");
        }

    }

}