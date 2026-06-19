class solution{
    int cnt = 0 ; 
    public boolean checkprime(int n){
    for(int i = 1 ; i<=n ; i ++ ){
    if(n % i == 0){
        cnt++ ;
    }
}
    
    return cnt == 2 ;
}
}

public class cpn{
    public static void main(String[] args) {
        int n = 2; 
        solution obj = new solution(); 
        boolean isPrime = obj.checkprime(n);

        if(isPrime){
            System.out.println("the entered  number is prime");
        }
        else{
            System.out.println("Is not prime");
        }
    }
}