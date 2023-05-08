package org.exercise3;

class Delivery {
    Long over;
    Long ball;
    Long runs;
    String batsman;
    String bowler;
    String nonStriker;

    public void displayDeliveryDetails(){
        System.out.println("Delivery Details : \n" +
                "Over : "+this.over+" \n" +
                "Ball : "+this.ball+" \n" +
                "Runs : "+this.runs+" \n" +
                "Batsman : "+this.batsman+" \n" +
                "Bowler : "+this.bowler+" \n" +
                "NonStriker : "+this.nonStriker);
    }
}