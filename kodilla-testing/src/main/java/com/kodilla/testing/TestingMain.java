package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args) {

        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        int result1 = calculator.add(5,6);
        int result2 = calculator.subtract(7,3);

        if(result1 == 5 + 6){
            System.out.println("test Ok");
        }else{
            System.out.println("Error !");
        }

        if(result2 == 7 - 3){
            System.out.println("test Ok");
        }else{
            System.out.println("Error !");
        }

    }

}
