package basicoops.day2;


class Animal{
    String color;
    String name;
    String breed;
    int age;

    void run(){
        System.out.println(name + " is running");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
}

public class main {
    public static void main(String[] args) {
       Animal dog = new Animal();
       Animal lion = new Animal();
       Animal dog1 = new Animal();
    //    dog.name = "tommy";
    //    dog.age = 2;
    //    dog.breed = "lab.";
    //    dog.color = "black";

    //    dog1.name = "tuffy";
    //    dog1.age = 4;
    //    dog1.breed = "lab.";
    //    dog1.color = "greey";

      

    // function explanation
    dog.name = "tommy";
    dog.age = 34;

    lion.name = "king";
    lion.age = 7;

     dog.run();
     lion.eat();
    }
}
