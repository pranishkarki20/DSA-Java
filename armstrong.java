public class armstrong {
    public static void main(String[] args) {
        int n = 301 ;
        int b = 0 ;
        int c = n ;
        while ( n > 0 ) {
            int a = n % 10 ; 
             b = b + (a*a*a);
             n = n / 10 ;
        }
        if(c==b){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
    
}
