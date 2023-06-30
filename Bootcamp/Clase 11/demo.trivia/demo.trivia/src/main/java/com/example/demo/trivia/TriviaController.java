package com.example.demo.trivia;

import com.example.demo.trivia.entity.Categorie;
import com.example.demo.trivia.entity.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public Question getQuestion(@PathVariable String categoria){
        Question quest = new Question();

        if(categoria.equalsIgnoreCase("Cine")) {
            quest.setCategory("Cine");
            quest.setQuestion("¿Quien dirigio El Secreto de sus Ojos?");
            String[] options = new String[3];
            options[0] = "Stranielli";
            options[1] = "Rodrigo";
            options[2] = "Campanella";
            quest.setOptions(options);
            quest.setAnswer(2);
            quest.setExplanation("Se filmo en 2009");
        }

        if(categoria.equalsIgnoreCase("Arte")) {
            quest.setCategory("Arte");
            quest.setQuestion("¿Quien pinto la Mona Lisa?");
            String[] options = new String[3];
            options[0] = "Rafaelo";
            options[1] = "Da Vinci";
            options[2] = "Bucetich";
            quest.setOptions(options);
            quest.setAnswer(1);
            quest.setExplanation("La pinto en 1797");
        }

        if(categoria.equalsIgnoreCase("Deportes")) {
            quest.setCategory("Deportes");
            quest.setQuestion("¿Quien Tiene mas ChampionsLeague?");
            String[] options = new String[3];
            options[0] = "Real Madrid";
            options[1] = "Barcelona";
            options[2] = "Bayer Munich";
            quest.setOptions(options);
            quest.setAnswer(0);
            quest.setExplanation("Con 14 Champions es el que mas posee");
        }


        if(categoria.equalsIgnoreCase("Cultura")) {
            quest.setCategory("Cultura");
            quest.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            quest.setOptions(options);
            quest.setAnswer(0);
            quest.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");
        }

        if(categoria.equalsIgnoreCase("Ciencia")) {
            quest.setCategory("Ciencia");
            quest.setQuestion("¿Que significa Fe en la tabla peroidica");
            String[] options = new String[3];
            options[0] = "Magnesio";
            options[1] = "Hierro";
            options[2] = "Plomo";
            quest.setOptions(options);
            quest.setAnswer(1);
            quest.setExplanation("Fe significa Hierro, que viene de Ferrum del latin");
        }


        if(categoria.equalsIgnoreCase("Historia")) {
            quest.setCategory("Historia");
            quest.setQuestion("¿Cuando fue la independencia de Argentina");
            String[] options = new String[3];
            options[0] = "25 de Mayo de 1810";
            options[1] = "9 Julio de 1816";
            options[2] = "20 Junio de 1820";
            quest.setOptions(options);
            quest.setAnswer(1);
            quest.setExplanation("Argentina se independizó el 9 de Julio de 1816");
        }
        return quest;
    }

    @GetMapping("/categories")
    public Categorie[] getQuestion(){

        Categorie cat = new Categorie();
        cat.setCategory("Cine");
        cat.setDescprition("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categorie cat2 = new Categorie();
        cat2.setCategory("Arte");
        cat2.setDescprition("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categorie cat3 = new Categorie();
        cat3.setCategory("Deportes");
        cat3.setDescprition("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categorie cat4 = new Categorie();
        cat4.setCategory("Cultura");
        cat4.setDescprition("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categorie cat5 = new Categorie();
        cat5.setCategory("Ciencia");
        cat5.setDescprition("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        Categorie cat6 = new Categorie();
        cat6.setCategory("Historia");
        cat6.setDescprition("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");


        Categorie[] categories = {cat,cat2,cat3,cat4,cat5,cat6};
        return categories;
    }




}
