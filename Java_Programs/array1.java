import java.util.*;
public class array1 {
    public static void main(String args[]){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter how many elements do you want to enter");
               int n=sc.nextInt();
               int a[]=new int[n];
               for(int i=0;i<n;i++){
                   a[i]=sc.nextInt();
               }
               System.out.println("You Entered Following Elements::");
               for(int j=0;j<n;j++){
                   System.out.println(a[j]);
               }


    }

}