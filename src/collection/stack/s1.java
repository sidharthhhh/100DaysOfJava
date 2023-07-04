package collection.stack;

import java.util.Stack;

class s1{
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("dog");
        animals.push("cat");
        animals.push("sparrow");

        // operation hote hai ...:- Push, pop, peek

        System.out.println(animals);
        
        System.out.println(animals.peek()); // sabse uper ka element btaata haai
        
        animals.pop(); // sabse uper ka element hatata haii ye....
        System.out.println(animals);
        System.out.println(animals.peek());



    }
}