
public class largest {
    public static void main(String args[]){
        int a[]={25,45,98,78,58};
        int largest=a[0];
        for(int i=0;i<5;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("The largest number is:" +largest); 

    }

}