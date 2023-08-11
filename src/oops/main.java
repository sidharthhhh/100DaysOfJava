package oops;

public class main {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.age = 23;
        // p1.name = "hero";
        // System.out.println(p1.age+ " " + p1.name);

        // Person p2 = new Person(32, "sid");
        
        // p2.age = 23;
        // p2.name = "chal be";
        // System.out.println(p2.name + " is "+ p2.age);

        // p1.walk(2);
        // System.out.println(Person.count);

    }
}


class Person{
    String name;
    int age;

    static int count;

    // public Person(){
    //     count++;
    //     System.out.println("creating an object");
    // }

    public Person(int newAge, String newName){
        this.name = newName;
        this.age = newAge;
    }

    // method
    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + "is eating");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
    void dowork(){
         System.out.println("person doing some work");
    }
}
