package com.example.demo.generate.password;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/generate-password")
    public String PasswordGenerator(){

            long random = Math.round((Math.random()*1000000));
            String stringRandom = "Daskgrjkg§";
            return stringRandom + random;
    }

    @GetMapping("/morse-code/{text}")
    public String GenerateMorseCode(@PathVariable String text){


        String wordMorseCode = "";

        String[] alphabetLetters = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"," "
        };

        String[] morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."," "
        };

        for (int i = 0; i < text.length(); i++) {

            String letterOfText = "" + text.charAt(i);


            for (int j=0;j<alphabetLetters.length;j++){
                 String letterAlphabet = alphabetLetters[j];

                if (letterAlphabet.equalsIgnoreCase(letterOfText)){
                    String letterMorseCode = morseCode[j];
                    wordMorseCode += " " + letterMorseCode;
                }
            }
            
        }

        return wordMorseCode;
    }

}
