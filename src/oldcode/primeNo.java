package oldcode;
public class primeNo {
    public static void main(String[] args) {
        int n= 20;
        for (int i = 0; i < n; i++) {
            System.out.println(i +" "+ isPrime(i));
        }
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c < n){
            if(c%n==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
