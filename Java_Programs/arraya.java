import java.util.*;
public class arraya {

    public static void main(String args[]){
        char vowels[]={'a','e','i','o','u'};
        char vowels1[]={'y','a','m','o','t'};
        System.out.println(vowels);
        System.out.println(vowels[2]);
        System.out.println(vowels[0]);
        System.out.println(Arrays.toString(vowels));
        // int starting_index=0;
        // int ending_index=4;       
        Arrays.sort(vowels1);
       System.out.println(Arrays.toString(vowels1));
       char vowels2[]={'a','t','k','b','r'};
       int starting_index=0;
         int ending_index=3; 
         Arrays.sort(vowels2,starting_index,ending_index);
       System.out.println(Arrays.toString(vowels2));
       System.out.println(vowels.length);


    }

}   