import java.util.*;
public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("\n");
        }

    }

}