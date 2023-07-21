package com.atl.newsletter.validators;

public class EmailValidator {

    public boolean isValid(String email){

        int atIndex = email.indexOf('@');
        int dotLastIndex = email.lastIndexOf('.');


        if (atIndex < 6 ||  atIndex > 30) {
            return false;
        }

        if (((dotLastIndex - atIndex) <= 2) || ((dotLastIndex - atIndex) > 11))  {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
                return false;
            }
        }

        if ((dotLastIndex >= email.length() - 2) || (dotLastIndex < email.length() - 7 )) {
            return false;
        }

        if (email.contains(".@")){
            return false;
        }

        if (email.contains("@.")){
            return false;
        }

        if (email.contains(" ")){
            return false;
        }

        if (email.startsWith(".")){
            return false;
        }

        if (email.endsWith(".")){
            return false;
        }

        if (email.contains("..")){
            return false;
        }

        return true;
    }
}
