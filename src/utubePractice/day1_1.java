package utubePractice;
import java.util.Arrays;

public class day1_1 {
    public static void main(String[] args) {
        int[] nums  = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));// arrays in java are mutable....we can change the object in java
    }

    static void change(int[] arr){
         arr[0]= 99;
    }
}
