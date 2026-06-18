import java.util.Scanner;
public class plaindoem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int b = 0 ; 
        int c =  n ;

        while( n > 0 ){
            int a = n % 10 ; 

             b = b * 10 + a ; 

            n = n/10 ;
        }

        if( b == c ){
            System.out.println("this is plaindrom");
        }
        else {
            System.out.println("this is not plaindrom");
        }
    }
}
