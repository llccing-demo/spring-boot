package com.llccing.micro.generic;

public class Area<T> {

        private T t;

        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
        public void getArea() {};

    public static void main(String[] args) {
        Area<Integer> rectangle = new Area<>();

        Area<Double> circle = new Area<>();

        rectangle.add(10);
        circle.add(2.5);

        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}
