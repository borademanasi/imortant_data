import java.util.*;
public class binary_search {
          public static void main(String args[]){
              char ch[]={'b','t','r','m','s'};
              System.out.println("Unsorted Array is" +Arrays.toString(ch));
              Arrays.sort(ch);
              System.out.println("Sorted Array is" +Arrays.toString(ch));
              char key='t';
              int a=Arrays.binarySearch(ch, key);//its consider sorted array
              System.out.println(a);
            

          }
} 