package com.llccing.micro.generic;

import java.util.ArrayList;
import java.util.List;

public class Practise {

    public static void main(String[] args) {
        System.out.println("Practise start");
    }

    /**
     * Single type parameter
     *
     * @param <T>
     */
    class Solution<T> {
        T data;

        public T getData() {
            return data;
        }
    }

    /**
     * multiple type parameters
     *
     * @param <K>
     * @param <V>
     */
    public class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    /**
     * Advantages of Java Generics
     */

    // Type Casting is not required.
    public void beforeGeneric() {
        List l = new ArrayList();
        l.add("India");
        String s = (String) l.get(0);
    }
    public void afterGeneric() {
        List<String> l = new ArrayList<>();
        l.add("India");
        String s = l.get(0);
    }

    // Compile -Time Checking
    public void compileTimeChecking() {
        List<String> l = new ArrayList<>();
        l.add("hello");
//        l.add(123);
    }
}

