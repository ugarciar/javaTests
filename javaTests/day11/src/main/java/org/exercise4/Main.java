package org.exercise4;

@FunctionalInterface
interface MyFunctionalInterface {
    Test create();

}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface mf = Test::new;
        mf.create();
    }
}