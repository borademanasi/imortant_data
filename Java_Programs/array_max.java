import java.util.*;
public class array_max {
        
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the array element which you want to enter :");
          int no=sc.nextInt();
          int max;
          int a[]=new int[no];
          for(int i=0;i<no;i++){
              a[i]=sc.nextInt();

          } 
          max=a[0];
        for(int i=0;i<no;i++){
              if(a[i]>max)
              max=a[i];
          }
          System.out.println("The Maximum Element is:"+max);


      }
}