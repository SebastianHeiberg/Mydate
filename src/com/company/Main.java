package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyDate dagsDato = new MyDate(1,1,2019);

        System.out.println(dagsDato.toString());

        for (int i = 0; i < 730; i++) {
            dagsDato.setToNextDay();
        }

        System.out.println(dagsDato.toString());


    }
}
