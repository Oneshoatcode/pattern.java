public class pattern17 {
    public static void main(String[] args) {
    
                int n=6;
                for (int i = 0; i < 6; i++) {
                    System.out.print(" *");   
                }
                System.out.println();
                for (int i = 0; i < n ; i++) {
                    //for space
                    for ( int j = 0; j <n-i-1 ; j++) {
                        System.out.print("  ");
                    }
                    //for star
                    for ( int j = 0; j < 1; j++) {
                        System.out.print("*");
                    }
                    for (int j = 0; j< i ; j++) {
                        System.out.print("");
                    }
                    System.out.println();
                }
            }
                
            }
            
    

