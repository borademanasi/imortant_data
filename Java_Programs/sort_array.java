import java.util.*;
public class sort_array {
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter how many array elements you want to enter");
           int no=sc.nextInt();
           int a[]=new int[no];
           int i;
           for(i=0;i<no;i++){
               a[i]=sc.nextInt();

           }
           System.out.println("The array is:");
           for(i=0;i<no;i++){
            
           System.out.println(a[i]);
           }
           Arrays.sort(a);
           System.out.println("The sorted array will be is:");
           for(i=0;i<no;i++){
            
           System.out.println(a[i]);
           }
           



       }
}