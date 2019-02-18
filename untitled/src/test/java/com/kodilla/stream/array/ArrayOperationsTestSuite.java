package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {


    @Test
    public void testGetAverage(){

        int [] tab = new int[20];

        IntStream.range(0,tab.length-1).forEach(i-> tab[i]=i+1);

        IntStream.range(0,tab.length).forEach(num -> System.out.print(num+" "));

        double mean = ArrayOperations.getAverage(tab);
        System.out.println( "MEAN = "+mean);

        Assert.assertEquals(9.5,mean,0);

    }
}
