
public class smallest {
        public static void main(String args[]){
         int m[]={100,50,25,20,54,2};
         int smallest=m[0];
         for(int i=0;i<6;i++){
             if(m[i]<smallest){
                 smallest=m[i];
             }
         }
         System.out.println("The smallest number is:" +smallest);
        }   
    }