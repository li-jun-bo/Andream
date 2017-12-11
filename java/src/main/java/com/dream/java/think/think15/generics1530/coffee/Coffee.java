//: generics/coffee/Coffee.java
package com.dream.java.think.think15.generics1530.coffee;

public class Coffee {

    private static long counter = 0;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

} ///:~
