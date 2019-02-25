package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers){
        System.out.println("Simple method without IntStream ");
        IntStream.range(0,numbers.length).forEach(num -> System.out.print(num+" "));
        double sum =0 ;
        for (int i=0;i<numbers.length;i++){
        sum +=numbers[i];
        }

        double mean = sum / numbers.length;
        return mean;

    }

static double getAverageWithIntStream(int [] numbers){

    System.out.println("Method uses IntStream");
        IntStream.range(0,numbers.length).forEach(num -> System.out.print(num+" "));
        double average = IntStream.range(0,numbers.length)
                //metoda map
                //mapować indeksy na wartosi z tablic
                .map(i->numbers[i])
                .average().getAsDouble();

return average;
}

}
