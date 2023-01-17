package com.llccing.micro.generic;

public class Hierarchies {
    public static void main(String[] args) {
        Generic2<String, Integer> x = new Generic2<>("value=", 1000);

        System.out.println(x.getObj2());
        System.out.println(x.getObj());


        Gen<String> w = new Gen<>("hello", 2023);
        System.out.println(w.getObj() + " " + w.getVal());

    }
}

/**
 * 泛型继承
 *
 * @param <T>
 */
class Generic1<T> {
    T obj;

    Generic1(T o1) {
        obj = o1;
    }

    T getObj() {
        return obj;
    }
}

class Generic2<T, V> extends Generic1<T> {
    V obj2;

    Generic2(T o1, V o2) {
        super(o1);

        obj2 = o2;
    }

    V getObj2() {
        return obj2;
    }
}

class NonGen {
    int n;

    NonGen(int i) {
        n = i;
    }

    int getVal() {
        return n;
    }
}

class Gen<T> extends NonGen {
    T obj;
    Gen(T o1, int i) {
        super(i);
        obj = o1;
    }
    T getObj() {
        return obj;
    }
}