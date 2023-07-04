package oldcode;
public class perfectSquare {

    static boolean isperfectsquare(int x){
        if(x>=0){
            int sq = (int)Math.sqrt(x);
            return ((sq*sq) == x);
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 34;
        if(isperfectsquare(x)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
