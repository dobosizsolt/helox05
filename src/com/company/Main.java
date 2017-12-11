package com.company;

public class Main {

    public enum SORT_DIRECTION{ASC, DESC}

    public static void main(String[] args) {

        int[] array = {3, 2, 6, 0};

        //bubleSort(array);

        bubleSort(array, SORT_DIRECTION.DESC);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



        /**Human human = new Human();
        //human.doMove();
        //human.doSleep();

        //Dob dob = new Dob();
        //dob.doMOve();
        //dob.doSleep();*/

    }


    /**public static void bubleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int getNum = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = getNum;
                }
            }
        }
    }*/

    public static void bubleSort(int[] array, SORT_DIRECTION sortDirection) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (sortDirection.equals(SORT_DIRECTION.ASC)) {
                    if (array[j] < array[j + 1]) {
                        int getNum = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = getNum;
                    }
                }
                else {
                    if (array[j] > array[j + 1]) {
                        int getNum = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = getNum;
                    }
                }
            }
        }
    }




}
