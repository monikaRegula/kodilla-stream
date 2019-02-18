package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers){
        double sum =0 ;
        for (int i=0;i<numbers.length;i++){
        sum +=numbers[i];
        }

        double mean = sum / numbers.length;
        return mean;
    }
}
