import java.util.*;
public class first_last_ele_arraylist {
     public static void main(String args[]){
          List<Integer> l2=new ArrayList<>();
          l2.add(25);
          l2.add(90);
          l2.add(258);
          l2.add(12);
          l2.add(2);
          l2.add(10);
          int first_element=l2.get(0);
          System.out.println(first_element);
          int last_element=l2.get(l2.size()-1);
          System.out.println(last_element);
          System.out.println(l2.size());

          

          

     }
}