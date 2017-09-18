package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] number ={2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        //When
        double aver = ArrayOperations.getAverage(number);
        //Then
        double suma = 0;

        for(int i=0;i<number.length;i++){
            suma+=number[i];}
        double aver1 = suma/number.length;
        Assert.assertEquals(aver1,aver,0);

    }
}
