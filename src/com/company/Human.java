package com.company;



public class Human implements IMOve, ISleep {
    public void doMove() {
        System.out.println("Human running");
    }

    public void dosleep() {
        System.out.println("Zzzzzzzz....");
    }

}
