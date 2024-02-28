import java.util.*;
public class even_arraylist {
            public static void main(String args[]){
                List<Integer> n1=new ArrayList<>();
                n1.add(1);
                n1.add(25);
                n1.add(4);
                n1.add(16);
                n1.add(8);
                n1.add(101);
                n1.add(45);
                n1.add(10);
                // for(Integer n2:n1){
                //     if(n2%2==0)
                //     System.out.println(n2);
                //     n1.remove(n2);
                    
                // }
                System.out.println(n1);
                
                n1.removeIf(number-> number % 2 == 0); // lambda expression
                System.out.println("After Removinig all Even Numbers From List ");

                System.out.println(n1);


               
                
            }
}
