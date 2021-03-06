package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {

    @Test
    public void testGetSandQuantity() {

        //GIVEN
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //WHEN
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //THEN
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //GIVEN
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //WHEN
        BigDecimal totalSand = continents.stream()//uruchamiamy strumieńckolekcji contitnents
                .map(SandStorage::getSandBeansQuantity)//zmiana na obiekty typu BigDecimal
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));//wywołujemy kolektor skalarny reduce
//wartość początkowa BigDecimal.ZERO ; dla każdej liczby w kolekcji wykonuje wyrażenie lambda
        //sum to wynik pośredni

        //THEN
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }
}
