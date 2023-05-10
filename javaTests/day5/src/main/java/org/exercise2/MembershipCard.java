package org.exercise2;

public class MembershipCard extends Card{

    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
        super(holderName, cardNumber, expiryDate);
        this.rating = rating;
    }

    @Override
    public void printDetails() {
        System.out.println(holderName + "'s Membership Card Details:");
        System.out.println("Card Number " + cardNumber);
        System.out.println("Rating " + rating);
    }
}
