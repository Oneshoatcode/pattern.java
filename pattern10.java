
public class pattern10 {
    public static void main(String[] args) {
        //this loop for space
        int n=5;
        int i;
        int j;
        for ( i = 0; i < n; i++) {
             for ( j= 0; j< n-i-1; j++) {
        System.out.print(" ");}
        //this loop for star
            for ( j = 0; j < 2*i+1; j++) {
            System.out.print("*");
            }
                //this loop for space
                for (j = 0; j<n-i-1; j++) {
            System.out.print(" ");
                }
                System.out.println();
          }
        }
        }
    
    

