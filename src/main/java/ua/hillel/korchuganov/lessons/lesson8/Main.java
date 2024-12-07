package ua.hillel.korchuganov.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // O(N)
        for (int i = 0; i < 5; i++) {
            
        }


//        int counter = 0;
//        //O(N^2)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                counter++;
//            }
//        }

//        int counter = 0;
//        //O(N^3)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 12; j++) {
//                for (int k = 0; k < 3 ; k++) {
//                    counter++;
//                }
//            }
//        }
//        System.out.println("counter = " + counter);

//     int[] array = {1, 5, 2, 5, 76, 23 , 2 ,6, 87};
//
//        int counter = 0;
//
//        for (int i = 0; i < array.length - 1 ; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("counter =  " + counter);
//        System.out.println(Arrays.toString(array));
//
//         int[] array = {1, 5, 2, 5, 76, 23 , 2 ,6, 87};
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 8;
        int index = -1;
        int counter = 0;

//        O(N) - BAD VERSION
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if( array[i] == element) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("counter = " + counter);

//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        while ( firstIndex <= lastIndex) {
//            counter++;
//
//            int middleIndex = (firstIndex + lastIndex) / 2;
//
//            if(array[middleIndex] == element) {
//                index = middleIndex;
//                break;
//            } else if(array[middleIndex] < element ) {
//                firstIndex = middleIndex + 1;
//            }else {
//                lastIndex = middleIndex - 1;
//            }
//        }


//        System.out.println("counter = " + counter);
//        System.out.println("index = " + index);

//        int indexArray = Arrays.binarySearch(array, element);
//        System.out.println("index = " +  indexArray );

        int[] array1 = {1, 2, 3 ,4,};
        int[] array2 = Arrays.copyOf(array, array.length);

        System.out.println(Arrays.toString(array2));
    }
}
