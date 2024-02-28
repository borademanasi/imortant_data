import java.util.*;
public class arraylist3 {
        public static void main(String args[]){
            ArrayList<String> a3=new ArrayList<>();
            a3.add("Manasi");
            a3.add("Pooja");
            a3.add("Komal");
            a3.add("Vaibhav");
            a3.add("Manasi");
            a3.add("SAKSHI");
            a3.add("PRIYANSH");  
            // for(String str:a3){
            //     System.out.println(str);
            // }

            ArrayList<String> a5=new ArrayList<>();
            a5.add("Vansh");
            a5.add("Ninad");
            a5.add("Spruha");
            a5.add("Siddhika");
            a5.add("Ansh");
            a5.add("Aaddya");
            a5.add("Aaradhya");
            a3.addAll(a5);
            System.out.println(a3);
        }
}   