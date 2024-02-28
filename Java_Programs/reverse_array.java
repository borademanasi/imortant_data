
public class reverse_array {
    public static void main(String args[]){
        int a[]={11,22,33,44,55};
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        int end=a.length-1;  //in array we use only length for array  and  lenth() for String
        System.out.println(end);
        System.out.println("The Reversed Array Is:");
        for(int j=end;j>=0;j--){
            System.out.println(a[j]);

        }
        
          
    }
}