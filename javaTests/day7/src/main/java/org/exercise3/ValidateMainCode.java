package org.exercise3;

public class ValidateMainCode {

    public static boolean validateTeam(String caption, String number) {
        try {
            Caption.valueOf(caption);
            Integer.parseInt(number);
        }catch (IllegalArgumentException ex){
            return false;
        }
        return true;
    }
}
