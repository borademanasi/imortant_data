import java.util.*;
public class reverse_arraylist {
          public static void main(String args[]){
              List<Integer> l1=new ArrayList<>();
              l1.add(10);
              l1.add(20);
              l1.add(30); 
              l1.add(40);
              l1.add(50);
              l1.add(60);
            //   System.out.println(l1);
            //   int li1=l1.size()-1;
              //System.out.println(li1);
            //   for(int   j=li1;j>=0;j--){
            //       System.out.println(j);
            //   }

            Collections.reverse(l1); // this is inbuilt function in java 
            System.out.println(l1);




          }
}