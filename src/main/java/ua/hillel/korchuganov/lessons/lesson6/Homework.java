package ua.hillel.korchuganov.lessons.lesson6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
            int a = 10;
            int b = 3;

            int sumTeam1 = 13;

            double result = (double) sumTeam1 / 5;
            double result2 = sumTeam1 / 5.0;
            double result3 = sumTeam1 / 5D;

            System.out.println(result);
            System.out.println(result2);
            System.out.println(result3);


            Scanner scanner = new Scanner(System.in);

            String nameTeam1 = scanner.nextLine();

            System.out.println("nameTeam1 = " + nameTeam1);

            int userValue = scanner.nextInt();
            System.out.println("userValue = " + userValue);

            scanner.nextLine();
            String nameTeam2 = scanner.nextLine();
            System.out.println("nameTeam2 = " + nameTeam2);

        }
        }

