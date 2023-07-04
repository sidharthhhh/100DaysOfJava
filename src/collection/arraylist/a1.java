package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a1 {
    public static void main(String[] args) {
    /*    List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(5);
        System.out.println(list);


        // adding an element at a perticular index
        list.add(1,32);
        System.out.println(list);

        // creating a new array list
        List<Integer> newList = new ArrayList<>();
        newList.add(23);
        newList.add(24);
        System.out.println(newList);

        // adding newlist to old list

        list.addAll(newList);
        System.out.println(list);

        // geting an element in  a array list
        System.out.println(list.get(1));  // list.get() method is used here  */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

      /*   list.remove(1); // this will remove the element from the index
        System.out.println(list);

        list.remove(Integer.valueOf(40));
        System.out.println(list);

        list.clear(); // clear all the element of list
        System.out.println(list); */

      /*  // for upadting a list
        list.set(2, 1000);  // O(1) ma kaam karta haiii
        System.out.println(list);

        // ye check karta hai ki array list ma element haii ya nhii..or uske base pe true or false return karta haii
        System.out.println(list.contains(30)); // answer is :- flase
         */

       
        //  looping in array list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }

        for(Integer elem: list){
            System.out.println("foreach in every element is"+ elem);
        }

        // Iterator in the array list
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+ it.next());
        }
         







    }
    
}
