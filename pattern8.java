public class pattern8 {
    public static void main(String[] args) {
        int i,j;
        int k=0;
        for (i = 1; i <= 9; i++) {
        if(i<=4){
            k++;
        }
        else{
            k--;
        }
          for ( j = 1; j <=5; j++) {
            if(j<=k){
                System.out.print("*");
            }
           
        }
        System.out.println();
    }
    
}
}
