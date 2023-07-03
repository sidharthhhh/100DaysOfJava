package oldcode;
public class perfectNo{
    public static void main(String[] args) {
        int num=3;
        int sum=0;

        for (int i = 1; i < num; i++) {
          if(num%i==0){
            sum= sum+i;
          }
        }

        if(sum==num){
            System.out.println( num +  " perfect no");
        }else{
            System.out.println("not a perfect no");
        }
    }
}