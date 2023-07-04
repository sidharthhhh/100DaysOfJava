package oldcode;
public class factorialOfNo {

    public static int factorial(int n){
     int res= 1;
     for (int i = 2; i <= n; i++) {
        res = res*i;
     }
     return res;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println("factorial of " + num + " is a " + factorial(num));
    }
}
