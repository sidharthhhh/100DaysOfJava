package linklist;

import java.util.*;

public class f1 {
 public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");

    System.out.println(list);

    list.addLast("this");
    System.out.print(list);

    System.out.println(list.size());
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i)+ "->");

    }
    System.out.println("null");

    list.remove(2);
    System.out.println(list);
    
 }
    
    


    
}
