import java.util.*;
public class max_arraylist {
    public static void main(String args[]){
         List<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(25);
        li.add(2);
        li.add(256);
        li.add(20);
        li.add(1);
        int max=li.get(0);
        for(Integer li1:li){
            if(li1>max)
            max=li1;
        }
        System.out.println(max);

    }
}