package ua.hillel.korchuganov.lessons.lesson12;

public class Cat extends Animal {

    void meow() {
        System.out.println(name + " meow");
    }

    @Override
    void eat(){
        meow();
        meow();
        System.out.println(name + " eating!!!");
    }
}
