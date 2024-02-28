import java.util.*;
public class sum_of_array {
           public static void main(String args[]){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the array elements ::");
               int no=sc.nextInt();
               int a[]=new int[no];
               int sum=0;
               for(int i=0;i<no;i++){
                   a[i]=sc.nextInt();
                   sum=sum+a[i];

               }
               System.out.println("The sum of the array elements::"+sum);

           }

}