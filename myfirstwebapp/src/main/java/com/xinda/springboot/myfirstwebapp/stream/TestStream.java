package com.xinda.springboot.myfirstwebapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Stream<Integer> stream = Stream.of(4, 5, 4, 3, 5, 23, 7, 9);
        List<Integer> list = stream.dropWhile(num -> (num > 5)).collect(Collectors.toList());

        System.out.println(list);
    }

    public static void test2() {
        Stream<String> stream = Stream.of("aman", "amar", "susjs", "johon");
        List<String> list = stream.dropWhile(name -> (name.charAt(0) == 'a')).collect(Collectors.toList());

        System.out.println(list);
    }

    public static void test3() {
        class Person  {
            String name;
            Integer age;
        }
        List<Person> list = new ArrayList<>();
    }
}
