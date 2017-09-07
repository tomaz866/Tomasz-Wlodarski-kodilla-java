package com.kodilla.testing.collecion;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public Integer exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> numbersEven = new ArrayList<Integer>();

        for(int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbersEven.add(numbers.get(i));
            }

        }
        return numbersEven.size();
    }
}
