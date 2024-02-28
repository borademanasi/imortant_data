import java.util.*;
public class array_min {
              public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter The Array Elemets:: ");
                    int no=sc.nextInt();
                    int a[]=new int[no];
                    int min;
                    for(int i=0;i<no;i++){
                        a[i]=sc.nextInt();
                    }
                    min=a[0];
                    for(int i=0;i<no;i++){
                        if(a[i]<min)
                        min=a[i];

                    }
                    System.out.println("the minimum element is:"+min);
                }
}