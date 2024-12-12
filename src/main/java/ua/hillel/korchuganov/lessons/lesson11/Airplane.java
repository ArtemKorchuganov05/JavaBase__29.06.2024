package ua.hillel.korchuganov.lessons.lesson11;

public class Airplane {
    String type;
    String name;
    int firstClassPassengers;
    int secondClassPassengers;

    public Airplane(String type, String name) {
        this.type = type;
        this.name = name;

        System.out.println("type = " + this.type + " name = " + this.name);
    }

    public Airplane(String type, String name, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;

        System.out.println("passengers without first class = " + this.type + " name = " + this.name + " count passengers second class" + this.secondClassPassengers);
    }

    public Airplane(String type, String name, int firstClassPassengers, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.firstClassPassengers = firstClassPassengers;
        this.secondClassPassengers = secondClassPassengers;

        System.out.println("passengers with first class = " + this.type + " name = " + this.name + " count passengers first class " + this.firstClassPassengers + " count passengers second class" + this.secondClassPassengers);
    }
}
