
public class array_common_elements{
           public static void main(String args[]){
               int a[]={10,20,30,40,50};
               int b[]={10,100,250,50,55};

               for(int i=0; i<a.length; i++){
                   for(int j=0; i<b.length; j++){
                    if(a[i]==b[j]){
                        System.out.println("The common elements:" + a[j]);
                       }
                   
                   }
               }
           }
}

// public class ArrayCommonElements {
//     public static void main(String args[]) {
//         int a[] = {10, 20, 30, 40, 50};
//         int b[] = {10, 100, 250, 50, 55};

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < b.length; j++) {
//                 if (a[i] == b[j]) {
//                     System.out.println("Common element: " + a[i]);
//                 }
//             }
//         }
//     }
// }