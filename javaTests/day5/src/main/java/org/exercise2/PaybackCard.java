package org.exercise2;

public class PaybackCard extends Card{
    private Integer pointsEarned;
    private Double totalAmount;

    public Integer getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned, Double totalAmount) {
        super(holderName, cardNumber, expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;
    }

    @Override
    public void printDetails() {
        System.out.println(holderName + "'s Payback Card Details:");
        System.out.println("Card Number " + cardNumber);
        System.out.println("Points Earned " + cardNumber);
        System.out.println("Total Amount " + cardNumber);
    }
}
