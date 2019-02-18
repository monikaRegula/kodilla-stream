package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList(){

        //final zeby zapobiec przypadkowym modyfiakcjom
        //dobrze jest typować zmienne przechowujące kolekcje przez typ interfejsu
        //a nie konkretnej klasy implementujacej interfejs
        //dlatego List = new ArrayList
        final List <String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");

        //zwracamy kopie listy
        //bo jezeli zmienimy cos w otrzymanej kolekcji to nie spowoduje
        //to zmiany wewnatrz klasy People ponieważ operacja bd na kopii obiektu theList
        return new ArrayList<String>(theList);
    }
}
