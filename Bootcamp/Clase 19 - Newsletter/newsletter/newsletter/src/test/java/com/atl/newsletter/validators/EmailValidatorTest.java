package com.atl.newsletter.validators;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;

@SpringBootTest
public class EmailValidatorTest {


    @Test
    public void CharactersAllowedBeforeAt(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result1 = emailValidator.isValid("fd@gmail.com");
        boolean result2 = emailValidator.isValid("asdasdasdasdasdasdaasdsdasdasdasd@gmail.com");
        assertFalse(result1);
        assertFalse(result2);
    }

    @Test
    public void CharactersAllowedBetweenAtAndDot(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result1 = emailValidator.isValid("fasdasdasdd@g.com");
        boolean result2 = emailValidator.isValid("asdassdf@gasdasfsgdg.com");
        assertFalse(result1);
        assertFalse(result2);
    }

    @Test
    public void AollowedAlphanumericCharacters(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("asddsd&/ff@gmail.com");
        assertFalse(result);
    }

    @Test
    public void CharactersAllowedAfterLastDot(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result1 = emailValidator.isValid("ejemplo@gmail.c");
        boolean result2 = emailValidator.isValid("ejemplo@gmail.comcomc");

        assertFalse(result1);
        assertFalse(result2);
    }


    @Test
    public void DotFollowedByAtNotAllowed(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("nahuelpierini.@gmail.com");
        assertFalse(result);
    }

    @Test
    public void AtFollowedByDotNotAllowed(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("nahuelpierini@.gmail.com");
        assertFalse(result);
    }

    @Test
    public void elEmailNoTieneQueTenerEspacioBlanco(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("nahuelpie rini@gmail.com");
        assertFalse(result);
    }

    @Test
    public void StartWithDotNotAllowed(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid(".nahuelpierini@gmail.com");
        assertFalse(result);
    }

    @Test
    public void EndWithDotNotAllowed(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("asdasdasd.@gmail.com.");
        assertFalse(result);
    }

    @Test
    public void DotsTogetherNotAllowed(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValid("asdadas..da@gmail.com");
        assertFalse(result);
    }

}
