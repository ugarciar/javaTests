package org.exercise2;

public class Player {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(String name, int age) throws CustomException {
        checkAge(age);
        this.name = name;
        this.age = age;
    }

    private void checkAge(int age) throws CustomException{
        if(age < 19){
            throw new CustomException("InvalidAgeRangeException");
        }
    }
}
