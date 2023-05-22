package org.exercise2;

@FunctionalInterface
interface MyFunctionalInterface {
    String concatenateStrings(String x, String y);

}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface msg = (x, y) -> x + " " + y;
        msg.concatenateStrings("C","G");
    }
}