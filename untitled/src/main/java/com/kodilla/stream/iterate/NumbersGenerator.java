package com.kodilla.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {

    //statyczna metoda generująca kolejne liczby parzyste
    //max to ilosc liczb wygenerowanych przez Stream
    public static void generateEven(int max){
        Stream.iterate(1, n->n+1)//wywołanie metody statycznej
                //tworzy strumień obiektowy typu Integer o wartości początkowej seed
                //kolejne wartości wyznaczane są przez wyrażenia lambda lub referencje
                //do metody
                .limit(max)//ogranicza wielkość strumienia do maxSize obiektów ( operacja filtrująca)
                .filter(n->n%2 == 0)//powstaje nowy Stream przez poprzednia linijke i
                //metoda filter(Predicate predicte) predicate to wyrażenie lambda
                //ktore zwraca true jak obiekt ma zostac w strumieni u
                //false jak obiekt do wywalenia
                .forEach(System.out::println);//forEach(Consumer action) operacja terminalna
        //zamyka strumień i przekształca go w typ konkretny
        //typ zwracany tej metody void
    }
}
