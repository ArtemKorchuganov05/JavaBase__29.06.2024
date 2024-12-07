package ua.hillel.korchuganov.lessons.lesson7;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//    int[] array1 = {1, 2, 3, 4, 5};
//    int[] array2 = array1;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
////        array2[0] = 99;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        
        array2[0] = 99;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }













    static void task1(){
        int[]  team = new int[10];

        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(team));

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < team.length; i++) {
            if(i % 2 == 0) {
                sumTeam1 += team[i];
            }else {
                sumTeam2 += team[i];
            }
        }
        System.out.println("sumTeam1 " + sumTeam1);
        System.out.println("sumTeam2 " + sumTeam2);

        if(sumTeam1 > sumTeam2){
            System.out.println("TEAM 1 WIN");
        }else if(sumTeam1 < sumTeam2) {
            System.out.println("TEAM 2 WIN");
        }else {
            System.out.println("DRAW");
        }
    }
}




