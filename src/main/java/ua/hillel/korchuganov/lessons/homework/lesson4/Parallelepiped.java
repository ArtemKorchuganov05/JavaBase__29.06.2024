package ua.hillel.korchuganov.lessons.homework.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {

        double sideA = 5.0;
        double sideB = 8.0;
        double sideC = 10.0;

        double volume = sideA * sideB * sideC;

        System.out.println(volume);

        double length = 4 * (sideA + sideB + sideC);

        System.out.println(length);

    }
}
