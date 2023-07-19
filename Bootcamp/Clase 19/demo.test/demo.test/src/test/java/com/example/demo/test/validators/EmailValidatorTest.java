package com.example.demo.test.validators;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;

@SpringBootTest
public class EmailValidatorTest {

    @Test
    public void CantidadDeCaracteresPermitidosAntesDelArrobaEsDe6Y30Caracteres(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado1 = emailValidator.esValido("fd@gmail.com");
        boolean resultado2 = emailValidator.esValido("asdasdasdasdasdasdaasdsdasdasdasd@gmail.com");
        assertFalse(resultado1);
        assertFalse(resultado2);
    }

    @Test
    public void CantidadDeCaracteresPermitidoEntreArrobaYPuntoEsDe6Y10Caracteres(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado1 = emailValidator.esValido("fasdasdasdd@g.com");
        boolean resultado2 = emailValidator.esValido("asdassdf@gasdasfsgdg.com");
        assertFalse(resultado1);
        assertFalse(resultado2);
    }

    @Test
    public void SoloPermiteCaracteresAlfanumericos(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado1 = emailValidator.esValido("asddsd&/ff@gmail.com");

        assertFalse(resultado1);
    }


    @Test
    public void LaCantidadDeCaracteresPermitidosLuegoDelPuntoEsValidaEntreDosYSeis(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado1 = emailValidator.esValido("ejemplo@gmail.c");
        boolean resultado2 = emailValidator.esValido("ejemplo@gmail.comcomc");

        assertFalse(resultado1);
        assertFalse(resultado2);
    }


    @Test
    public void elEmailNoPuedeTenerPuntoSeguidoDeArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("nahuelpierini.@gmail.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoPuedeTenerArrobaSeguidoDePunto(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("nahuelpierini@.gmail.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoTieneQueTenerEspacioBlanco(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("nahuelpie rini@gmail.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoPuedeQueEmpezarConPunto(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido(".nahuelpierini@gmail.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoPuedeTerminarEnPunto(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("asdasdasd.@gmail.com.");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoPuedeTenerDosPuntosSeguidos(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("asdadas..da@gmail.com");
        assertFalse(resultado);
    }

}
