public class pattern16 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
   
        for (i = 0; i < n; i++) {
              //this loop for star
         for ( j= 0; j < n-i; j++) {
             System.out.print(1);
             
         }
       for ( j= 0 ; j <2*i; j++) {
 System.out.print(" ");
         }
         for ( j = 0; j < n-i; j++) {
             System.out.print( 1);
         }
 System.out.println();
 } 
 for (i = 0; i <= n; i++) {
    //this loop for star
for ( j= 0; j < i; j++) {
   System.out.print(1);
   
}
for ( j= 0 ; j < 2*n-(2*i); j++) {
System.out.print(" ");
}
for ( j = 0; j < i; j++) {
   System.out.print( 1);
}
System.out.println();
} 

    }
    
}
