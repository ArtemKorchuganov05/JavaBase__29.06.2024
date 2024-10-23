package ua.hillel.korchuganov.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        int a = 5;
//        int b = 10;
//
//        boolean result = a !=  b;
//
// //       System.out.println(result);
//
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
////        System.out.println(str1 == str2);
////        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        int a = 5;
//        int b = 10;
//        int c = 15;
//
////        boolean result = a < b && b < c;
//        boolean result = a > b || b > c;
//
//        System.out.println(result);


//        int x1 =(int) (Math.random() * 6);
//        System.out.println(x1);
//
//        if(x1 == 1 || x1 == 2 || x1 == 3) {
//            System.out.println("Hello");
//        }else {
//            System.out.println("Bye");
//        }

//        int age1 = 11;
//        int age2 = 12;
//        int age3 = 18;
//        int age4 = 21;
//
//        boolean result = age1 >= 20 && age2 >= 20 && age3 >= 20 && age4 >= 20;
//
//        System.out.println(result);

//        int a = 30;
//        int b = 30;

//        if(a > b) {
//            System.out.println("Hello");
//        }

//        if(a < b) {
//            System.out.println("Hello");
//        }else {
//            System.out.println( "a <= b");
//        }

//        if( a > b){
//            System.out.println("a > b");
//        }else if (a < b){
//            System.out.println("a < b");
//        }else {
//            System.out.println("a == b");
//        }

//        if(a <= b){
//            System.out.println("a <= b");
//
//            if (a < b){
//                System.out.println("a < b");
//            } else {
//                System.out.println("a == b");
//            }
//        } else {
//            System.out.println("a > b");
//        }

//        if(a != b){
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println("4");
//        }

//        int a = 20;
//        int b = 10;
//
//        if(a >= b) {
//            System.out.println("Yes");
//            if(a == b){
//                System.out.println("a = b");
//            }else {
//                System.out.println("a > b");
//            }
//        } else {
//            System.out.println("No");
//        }
//
////        System.out.println((a > b) ?  "Yes" : "No");
//        System.out.println((a > b) ?  "Yes " + ((a ==b) ? " a = b" : "a > b") : "No");

//        int a = 3;
//
//        if (a == 1) {
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        } else if (a == 5) {
//            System.out.println("5");
//        }else{
//            System.out.println("default");
//        }
//
//        switch (a) {
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//
//        String str = "QWE";
//
//        switch (str) {
//            case "qwe": {
//                System.out.println("1");
//                break;
//            }
//            case "Qwe": {
//                System.out.println("2");
//                break;
//            }
//            case "QWe": {
//                System.out.println("3");
//                break;
//            }
//            case "QWE": {
//                System.out.println("4");
//                break;
//            }
//        }
//
//        System.out.println((str.equalsIgnoreCase("qwe")));

        //SCANNER

        Scanner sc = new Scanner(System.in);

//        String userValue = sc.next();
//        System.out.println("userValue = " + userValue);
//
//        String userValue2 = sc.next();
//        System.out.println("userValue2 = " + userValue2);

        int integerUserValue = 0;

        if(sc.hasNextInt()){
             integerUserValue = sc.nextInt();
             sc.nextLine();
        }else {
            System.out.println("Wrong data. Try again!");
            System.exit(0);
        }


        System.out.println("integerUserValue = " + integerUserValue);
//
//        int value1 = sc.nextInt();
//        int value2 = sc.nextInt();
//        int value3 = sc.nextInt();
//
//        System.out.println("value1 = " + value1);
//        System.out.println("value2 = " + value2);
//        System.out.println("value32 = " + value3);


        sc.nextLine();
        String strUserValue = sc.nextLine();
        System.out.println("strUserValue = "  + strUserValue);

        System.out.println("Input name team1");
        sc.nextLine();
        System.out.println("Input frags player 1 team1");
        sc.nextLine();
        System.out.println("Input frags player 2 team1");
        sc.nextLine();
        System.out.println("Input frags player 3 team1");
        sc.nextLine();
        System.out.println("Input frags player 4 team1");
        sc.nextLine();
        System.out.println("Input frags player 5 team1");
        sc.nextLine();

    }
    }

