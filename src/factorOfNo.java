public class factorOfNo {
    public static void main(String[] args) {
        int n =10;
        System.out.println(n);

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
