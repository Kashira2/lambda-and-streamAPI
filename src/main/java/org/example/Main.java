package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {

//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x+y);
//            }
//        };

//        PlainInterface plainInterface = (x, y) -> String.valueOf(x+y);
//        PlainInterface plainInterface1 = (x, y) -> String.valueOf(Integer.compare(x, y));

//        PlainInterface plainInterface = Integer::sum;
//        PlainInterface plainInterface1 = Integer::compare;
//
//
//        System.out.println(plainInterface.action(5,3));
//        System.out.println(plainInterface1.action(1,5));

//    List<String> list = Arrays.asList("Привет", "!", "я", "родился", "!");

//    list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//
//        for (String item: list ) {
//            System.out.println(item);
//        }
//
//        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("о")).forEach(System.out::println);
//
//        Arrays.asList(1,2,3,4,5).stream().map(chislo ->"число: " + chislo + " квадра числа: " + chislo * chislo).forEach(System.out::println);


//        Arrays.asList(1,20,3,-4,5,3).stream().sorted().distinct().forEach(System.out::println);

//
//        System.out.println(Arrays.asList(1,20,3,-4,5,3).stream().sorted().distinct().findFirst().get());

        List<User> list = Arrays.asList(new User("Павел", 25), new User("Аркадий", 40), new User( "Валера", 30));

        list.stream().map(user -> new User(user.name, user.age - 5)).filter(user -> user.age <= 25).forEach(System.out::println);

    }
}