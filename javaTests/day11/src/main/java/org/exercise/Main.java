package org.exercise;

@FunctionalInterface
interface MyFunctionalInterface {
    int multiplyNumbers(int x, int y);

}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface msg = (x, y) -> x*y;
        msg.multiplyNumbers(3,4);
    }
}