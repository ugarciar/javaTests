package org.exercise3;

public class InternationalPlayer extends Player{
    private String capNumber;
    private Long noOfTestAppearance;
    private Long noOfODIAppearance;

    public InternationalPlayer(String name, String country, String capNumber, Long noOfTestAppearance, Long noOfODIAppearance) {
        super(name, country);
        this.capNumber = capNumber;
        this.noOfTestAppearance = noOfTestAppearance;
        this.noOfODIAppearance = noOfODIAppearance;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Cap number: " + this.capNumber);
        System.out.println("Number of test appearance: " + this.noOfTestAppearance);
        System.out.println("Number of ODI appearance: " + this.noOfODIAppearance);
    }
}