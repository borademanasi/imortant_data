import java.util.*;
public class reverse_string {
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the String that you want to reversed");
           String str=sc.nextLine();
           System.out.println("You entered String is::"+str);
           int str_len=str.length();
           String result=""; // to add the reverse string character in empty string
          // System.out.println(str_len);
           for(int i=str_len-1;i>=0;i--){
               result=result+str.charAt(i);
           }
           System.out.println(result);
           
       }
}