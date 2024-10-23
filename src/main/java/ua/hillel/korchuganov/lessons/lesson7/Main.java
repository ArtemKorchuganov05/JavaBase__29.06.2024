package ua.hillel.korchuganov.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];
//
//        array[0] = 9;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        System.out.println(array.length);


//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == 3 || array[i] == 4) {
//                array[i] = 77;
//            }
//                System.out.println(array[i]);
//        }

//        for (int value : array) {
//            System.out.println(value);
//        }

//        System.out.println(Arrays.toString(array));


//            int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//                array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
////            System.out.println("index = " + i);
////            System.out.println("value = " + array[i]);
////            System.out.println();
//
//            if ( i == array.length-1) {
//                System.out.print(array[i]);
//            }else {
//                System.out.print(array[i] + ", ");
//            }

        int[] array = new int[5];
        int array2[] = new int[5];
        int[] array3 = {1,2,5,6,9};
        int[] array4 = new int[0];






    }


    static void task1() {

//        int[] array = new int[5];
//
//        array[0] = 9;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        System.out.println(array.length);


//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == 3 || array[i] == 4) {
//                array[i] = 77;
//            }
//                System.out.println(array[i]);
//        }

//        for (int value : array) {
//            System.out.println(value);
//        }

//        System.out.println(Arrays.toString(array));


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < array.length; i++) {
//            System.out.println("index = " + i);
//            System.out.println("value = " + array[i]);
//            System.out.println();

            if ( i == array.length-1) {
                System.out.print(array[i]);
            }else {
                System.out.print(array[i] + ", ");
            }

        }
    }
}
