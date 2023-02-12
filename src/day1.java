import java.util.Arrays;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        // array syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll no:
        // int[] rnos = new int[5];
        // or directly
        // int[] rnos2 = {23,43,23,45,22};

        // int[] ros; // decleartion of array
        // ros = new int[4]; // actual object is created in heap memory

        //important properties
        // arrray object are in heap 
        //heap object are not continous
        //Dynamic memories allocation
        // may not be continious -> its depend upon JVM

        // new -> is key word used to create an object in heap memory

        // System.out.println(rnos2[2]);

        //for strings

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // String str = null;

        // int a = null;  privitive ma assign nhii kar sacte...

        // String[] arr = new String[5];
        // int[] arr = new int[5];

       //input using for loops

    //    for (int i = 0; i < arr.length; i++) {
    //      arr[i] = in.nextInt();
    //    }


    // shortcut method to print a array
    // System.out.println(Arrays.toString(arr));

    //    for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i] + " ");
    //   }

      // concept of foreach loop [important concept]

    //   for(int num: arr){// for every element of array , print the element
    //     System.out.print(num + " ");// num represent element of arrray
    //   }


   // arrays of object

   String[] str = new String[4];
   for (int i = 0; i < str.length; i++) {
      str[i] = in.next();
   }

   System.out.println(Arrays.toString(str));

   //modify
   str[1] = "sid"; // beech ma change karre haiii
   System.out.println(Arrays.toString(str));

}
}
