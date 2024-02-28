import java.util.*;
public class min_arraylist {
    public static void main(String args[]){
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(52);
        l1.add(65);
        l1.add(75);
        l1.add(90);
        l1.add(155);
        l1.add(20);
        l1.add(1);
        l1.add(15);
        int min=l1.get(0);
        //System.out.println(min);
        for(Integer l2:l1){
            if(l2<min)
            //min=l2;//its optional
           

               System.out.println(l2);
        }
        //  System.out.println(min);// its optional 

    }
}