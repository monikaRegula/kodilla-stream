package com.kodilla.stream;

import com.kodilla.stream.beautifier.Beautfier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        //BEAUTIFIER:

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Welcome", Beautfier::bigLetters);
        poemBeautifier.beautify("Hello",Beautfier::addingABC);
        poemBeautifier.beautify("Good morning",Beautfier::smallLetters);
        poemBeautifier.beautify("ABCHElloABC",Beautfier::replaceABCtoCBA);
        poemBeautifier.beautify("Ananase",Beautfier::replaceAToE);


        //********************************************************
        Forum forum = new Forum();

        Map<Integer, ForumUser> map = forum.getTheList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1999)
                .filter(forumUser -> forumUser.getPostAmount() >= 1)
                .collect(Collectors.toMap(ForumUser::getID,forumUser -> forumUser));

        System.out.println("#elements: "+map.size());
        map.entrySet().stream()
                .map(entry -> entry.getKey() + " : "+ entry.getValue())
                .forEach(System.out::println);








//KOLEKTOR JOINING
//Collectors.joining(String delimiter, String prefix, String suffix)
        //na wejściu musi być obiekt typu String
        //kolektor łączy wszystkie Stringi w 1 ciąg znaków i na początku daje prefix i na końcu suffix
        //delimeter to rozdzielacz poszczególnych obiektów

//BookDirectory bookDirectory = new BookDirectory();
//String resultBook = bookDirectory.getList().stream()
//        .filter(book -> book.getYearOfPublication()>2005)
//        .map(Book::toString)
//        .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(resultBook);

    //KOLEKTOR DO MAP
//        BookDirectory bookDirectory = new BookDirectory();
//
//        Map<String,Book> resultMap = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() >2005)
//                .collect(Collectors.toMap(Book::getSignature,book -> book));
        //UŻYWAMY KOLEKTORA Collectors.toMap(Funcion keyMapper, Function valueMapper)
        //keyMapper to funkcja (wyrażenie lambda/ referencja do metody) obliczająca klucz pary w mapie wynikowej
        //Book::getSignature

        //valueMapper to wartość obiektu
        //book -> book
//                System.out.println("# elements: "+resultMap.size());
//        resultMap.entrySet().stream()
//                .map(entry -> entry.getKey() + " : "+ entry.getValue())
//                .forEach(System.out::println);


        //KOLEKTOR DO LISTY
//        BookDirectory bookDirectory = new BookDirectory();
//        List<Book> result = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() >2005)
//                .collect(Collectors.toList());//wywołuje metode terminalną tworąca wynikowa kolekcje danych
//        System.out.println("#elements: "+result.size());
//
//        result.stream()
//                .forEach(System.out::println);


//
//        BookDirectory bookDirectory = new BookDirectory();
//        bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() >2005)
//                .forEach(System.out::println);







//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s ->s.length() > 11)
//                .map(s-> s.substring(0,s.indexOf(' ') + 2)+".")
//                .filter(s-> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);




//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .forEach(System.out::println);



//        People.getList().stream()
//                .map(s -> s.toUpperCase())
                //.map.(String::toUpperCase) // to wskazanie referncji do metody toUpperCase klasy String
                // metoda stream inicjuje strumień
                //.forEach(System.out::println);//forEach operacja terminalna  która na kżdym obikecie w kolekcji
        //wykonuje metody println(String x)

//        System.out.println("Using Stream to generate even numbers form 1 to 20.");
//        NumbersGenerator.generateEven(20);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Obliczanie lamdami");
//        expressionExecutor.executeExxpression(10,5,(a,b)->a+b);
//        expressionExecutor.executeExxpression(10,5,(a,b) ->a-b);
//        expressionExecutor.executeExxpression(10,5,(a,b) ->a*b);
//        expressionExecutor.executeExxpression(10,5,(a,b) ->a/b);
//
//        System.out.println("obliczanie referencjami do metod statycznych");
//        expressionExecutor.executeExxpression(3,4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExxpression(3,4,FunctionalCalculator::addAToB);
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("OD razu lambda"));
//        Executor codeToExecute = () -> System.out.println("LAMBDA");
//        processor.execute(codeToExecute);
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);


//        System.out.println("Welcome to module 7 - Stream");
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
    }
}
