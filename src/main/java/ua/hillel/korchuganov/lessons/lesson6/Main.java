package ua.hillel.korchuganov.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        for (int i = 1; ; i++) {
//            if (i > 10) {
//                break;
//            }
//
//            if (i > 10){
//                continue;
//            }
//            System.out.println(i);
//        }


//        for (int i = 0; i <= 20 ; i+= 2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20; i++) {
//            if(i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }

        //FIBONACHI

//        int num1 = 1;
//        int num2 = 1;
//        int sum;
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9 ; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//        }

//        for (int i = 0, j = 10, k = 20; i < 10 && j > 5; i++, j--) {
//            System.out.println(i);
//            System.out.println(j);
//            System.out.println();
//            System.out.println();
//        }

        //WHILE
//
//        int i = -1;
//        while(true){
//            i++;
//            if (i == 5){
//                continue;
//            }
//            if(i > 10){
//                break;
//            }
//            System.out.println(i);
//
//        }

//        int i = 5;
//
//        do{
//            System.out.println("YES");
//            i++;
//        }while(i < 4);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter integer from 10 to 20");
//
//        while(true){
//        if(scanner.hasNextInt()) {
//            int userValue = scanner.nextInt();
//            if(userValue >= 10 && userValue <= 20) {
//                System.out.println("user value = " + userValue);
//                break;
//            }else {
//                System.out.println("Enter integer from 10 to 20");
//                scanner.nextLine();
//            }
//        } else {
//            System.out.println("Wrong data! Try again");
//            scanner.nextLine();
//            }

//        int time = 10;
//        while(true) {
//            System.out.println(time);
//
//            int random =(int) (Math.random() * 101);
//            System.out.println("random " + random );
//
//            if(random >= 85 && random <= 100){
//                System.out.println("WIN!");
//                break;
//            }
//            if(time == 0){
//                System.out.println("BOOOM!");
//                break;
//            }
//            time--;
//        int chance = 101;
//        int j = 0;
//
//        for (int i = 0; i < 100; i++) {
//            int random = (int) (Math.random() * chance);
//            System.out.println("random = " + random);
//
//            if(random == 0 || random == 1) {
//                System.out.println("JACKPOT!!!");
//                break;
//        }
//
//            if(j == 10) {
//                chance -= 10;
//                j = 0;
//            }
//
//        }

        for (int i = 1; i < 100; i++) {
            if (i == 4 || i == 9 || i / 10 == 4) {
                continue;
            }
            System.out.println(i);

            int x = 29;

            System.out.println(x / 10);
            System.out.println(x % 10);

        }
    }
}


