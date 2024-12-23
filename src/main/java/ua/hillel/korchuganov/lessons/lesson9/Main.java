package ua.hillel.korchuganov.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][] array = {
//                {1,2,3},
//                {2},
//                {65,4,3,1,4,6,7,45},
//                {},
//                {4,4,4,4}
//        };

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][][] array = new int[3][2][4];

//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        //       System.out.println(Arrays.toString(array[2][0]));


        int[][][][] array =
                {
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 98, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        },
                        {
                                {
                                        {18,28,18,28},
                                        {45,90,45,0}
                                },
                                {
                                        {7,125,500,5},
                                        {0,11,25,30}
                                },
                                {
                                        {81,17,19,55},
                                        {1,7,38,11}
                                }
                        }
                };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                for (int k = 0; k < array[i][k].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
            
        }

    }
        static void task1() {
            //        int[][] array = new int[3][5];
//
//        array[0][0] = 77;
//        array[2][4] = 99;

//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);

//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < args.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

            //       int[] arr = {1,2,3,4,5};

//        int[][] array = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15}
//        };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[] row1 = array[1];
////        System.out.println(Arrays.toString(row1));
//        for (int i = 0; i < row1.length; i++) {
//            System.out.println(row1[i] + " ");
//        }

            int[][] matrix = new int[5][5];

            //version 1
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length ; j++) {
//                if(i == j) {
//                    matrix[i][j] = 1;
//                }
//            }
//        }
            //version 2
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
            }

            //version 1
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i + j == matrix.length - 1) {
//                    matrix[i][j] = 1;
//                }
//            }
//        }

            //version 2
//        for (int i = 0, j = matrix.length - 1; i < matrix.length ; i++, j--) {
//                matrix[i][j] = 1;
//        }

            //version3

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][matrix[i].length - 1 - i] = 1;
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }


            int sum = 0;
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    count++;
                }
            }

            double avg = (double) sum / count;
            System.out.println("avg = " + avg);


        }
        static void task2(){
            char[][] chess = new char[8][8];

            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[i].length; j++) {
//                if((i + j) % 2 == 0 ) {
//                    chess[i][j] = 'B';
//                }else {
//                    chess[i][j] = 'W';
//                }

                    chess[i][j] = ((i + j) % 2 ==0) ? 'B' : 'W';
                    System.out.print(chess[i][j] + "\t");
                }
                System.out.println();
            }

//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }
        }
    }

