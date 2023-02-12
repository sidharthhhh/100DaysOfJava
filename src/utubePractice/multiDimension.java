import java.util.Arrays;
import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9 
         */

         Scanner in = new Scanner(System.in);

        //  int[][] arr = new int[3][]; // coloum ko specify karna mendetryv nhi haii.....but rows ko define jaruruii haiii
        // int[][] arr = {
        //     {1,2,3},//0th index
        //     {4,5},//1st index
        //     {6,7,8,9},//2nd index
        // };// imagine this as an arrays of array
   

        int[][] arr = new int[3][3];
        System.out.println(arr.length);// ye no. of rows btaaaiga
        //input
        for (int row = 0; row < arr.length; row++) {
            // for every colom in a row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        // for (int row = 0; row< arr.length; row++) {
        //     for (int col = 0; col < arr.length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //output by inhance for loop
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }
     
        // output hiii haiii for each loop se
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


    }

    
}
