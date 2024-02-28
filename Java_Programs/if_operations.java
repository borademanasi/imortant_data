import java.util.*;
public class if_operations
 {
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number1");
          int no1=sc.nextInt();
          System.out.println("Enter the number2");
          int no2=sc.nextInt();
          System.out.println("Which operation would u want to perform");
          String str=sc.next();
          if(str.equals("sum")){
              System.out.printf("The addition is %d+%d=%d",no1,no2,no1+no2);
          }
          else if(str.equals("sub")){
              System.out.println(no1-no2);
          }
          else if(str.equals("mul")){
            System.out.println(no1*no2);
        }
        }

      }
       