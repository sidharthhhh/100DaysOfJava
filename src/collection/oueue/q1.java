package collection.oueue;

import java.util.LinkedList;
import java.util.Queue;

public class q1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(13);
        queue.offer(14); // offer queue ke andar element daalne ke kaam aata hai

        System.out.println(queue);
        
        System.out.println(queue.poll()); // element ko remove karta hai and value return karta haii
        System.out.println(queue);
        
        System.out.println(queue.peek()); // next kon sa element niklega wo btaata hai ye
       
        

      
    }
    
}
