public class bar_chart {
    public static void main(String[] args) {
        int n=5;
        int a[]={5,2,1,3,4};
        int max=a[0];
        for (int i = 0; i <a.length; i++) {
            if(max<a[i]){
                max=a[i];
            }
            
        }
        System.out.println(max);
        for (int flor = max; flor >=1; flor--) {
            for (int i = 0; i <a.length; i++) {
                if(a[i]>=flor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
