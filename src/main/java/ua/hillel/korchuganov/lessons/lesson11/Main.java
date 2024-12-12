package ua.hillel.korchuganov.lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person alex2 = new Person("Alex");


        System.out.println(alex == alex2);
        System.out.println(alex.equals(alex2));

        //        alex.name = "Alex";
//        alex.age = 30;

//        alex.sayHello();
//        alex.printAge();

//        Person oleg = new Person();
//        oleg.name = "Oleg";
//        oleg.age = 40;
//
//        oleg.sayHello();
//        oleg.printAge();

    }
}
