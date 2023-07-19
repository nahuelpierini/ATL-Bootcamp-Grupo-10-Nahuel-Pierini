package com.example.demo.test.validators;

public class EmailValidator {
    /*
     Me basaré en validar direccion de e-mail en base al modelo de direccion aceptadas por Gmail:
        Solo permite caracteres ALFANUMERICOS  Y " . " aunque no puede empezar ni  terminar con " . " y no puede haber dos " . " consecutivos ni estar pegados al "@".
        Ademas la longitud comprendida es entre 6 y 30 caracteres antes del " @ ".
     Por otro lado agrego la condicion de que luego del arroba debe haber al menos 2 caracteres y no mas de 10 hasta el " . ".
     Y luego del " . " no debe excederse en 6 caracteres.
    */

    public boolean esValido(String email){

        int indiceArroba = email.indexOf('@');
        int indiceUltimoPunto = email.lastIndexOf('.');



        // Verificar si hay entre 6 y 30 caracteres antes del "@"
        if (indiceArroba < 6 ||  indiceArroba > 30) {
            return false;
        }

        // Verificar si hay entre 6 y 10 caracteres despues del "@" y antes del "."
        if (((indiceUltimoPunto - indiceArroba) <= 2) || ((indiceUltimoPunto - indiceArroba) > 11))  {
            return false;
        }


        // Verificar si solo contiene caracteres alfanuméricos
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
                return false;
            }
        }


        // Verificar si hay al menos dos caracteres después del último punto y no más de seis
        if ((indiceUltimoPunto >= email.length() - 2) || (indiceUltimoPunto < email.length() - 7 )) {
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
