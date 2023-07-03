package oldcode;
public class minimumNoinarray
{
  public static void main(String args[])
  {
    int[] arr= {5,3,2,4,65};
     int min = arr[0];

  for (int i = 0; i < arr.length; i++) {
    if(min>arr[i]){
        min = arr[i];
    }
  }
  System.out.println(min + " ");
  }
}