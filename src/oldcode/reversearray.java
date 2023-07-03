package oldcode;
class reversearray{
    public static void main(String[] args) {
        // iterative approch
        // int[] arr = {12,23,34,65};
        // int n = arr.length;

        // for(int i=n-1; i>=0; i--){
        //      System.out.print( arr[i]+ " "); 
        // }

        //swaping approch
        // int[] arr= {12,543,4,23,45,19};
        // int n= arr.length;
        // int start = 0;
        // int end = n-1;
        // while(start<end){
        //     int temp = arr[start];
        //      arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        //     }
        //     for (int i = 0; i < arr.length; i++) {
        //         System.out.print(arr[i]+" ");
        //     }


        //recursive approch
        int[] arr= {23,543,23,19,53,566,167};
        int n = arr.length;
        int start=0;
        int end= n-1;

        reverse(arr, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
             if(start>=end){
                return;
             }

             int temp = arr[start];
             arr[start]= arr[end];
             arr[end]= temp;

             reverse(arr, start+1, end-1);
    }
}