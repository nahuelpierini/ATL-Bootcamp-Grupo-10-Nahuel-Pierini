package com.example.trivia.db.controller;


import com.example.trivia.db.entity.Categorie;
import com.example.trivia.db.entity.Question;
import com.example.trivia.db.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TriviaController {



        /* Para poder invocar todas las funciones de la interface CategoryRepository debo crear un atributo y un constructor de CategoryRepository, de esta forma puedo llamar
           a todas las funciones de la interface y hacer uso de ellas en esta clase. La otra forma es con @Autowire como explicó Lucas.
           https://stackoverflow.com/questions/40620000/spring-autowire-on-properties-vs-constructor ahi explican porque es mejor hacer la injeccion de dependencia de esta forma que con @Autowire
        */
    private CategoryRepository catR;
    public TriviaController(CategoryRepository catR) {
        this.catR = catR;
    }


        //Primero  Cree esta funcion para probar la URL localhost/categories/id y ver si me devolvia los valores desde la base de datos hacia el frontEnd

    @GetMapping("/categories/{id}")
    public Optional<Categorie> getQuestion(@PathVariable int id){

        /* IntelliJ me hace cambiar el tipo de dato de Categorie a Optional ya que la funcion que proviene del CategoryRepositry es de tipo Optional
           Aqui creo una lista de Objetos (en este caso una lista de Categorie) la cual segun el ID que le pase en la URL buscará en la BASE DE DATOS y me devolverá ese Objeto
           con sus atributos id, category y description definidos en mi BD.
           https://www.arquitecturajava.com/que-es-un-java-optional/ aqui explica porque se usa Optional, en definitiva para evitar NULLPOINTEREXCEPTION
        */
        Optional<Categorie> ejemplo = catR.findById(id);

        return ejemplo;

    }

         /* Para que el juego funcione debo crear esta funcion asiciada a la URL: /categories xq asi esta asociada con el FrontEnd. Por lo tanto yo aqui necesito que me devuelva
           TODAS LAS CATEGORIAS que tengo almacenadas en la Base de Datos. y asi funcionará la TRIVIA.

         */
    @GetMapping("/categories")
    public List<Categorie> getQuestion(){

        // Al necesitar todas las categorias, creo una Lista de Categorias por ahora vacia
        List<Categorie> resultado = new ArrayList<>();
        /* En este punto voy a llenar la lista de Categoria con el nombre resultado. Para ello lo que hago es invocar al metodo findAll(), que proviene de CategoryRepository
           y este metodo me devolverá todas las Categorias que tengo almacenadas en la base de datos. Esto lo hace automaticamente SpringBoot y me arroja todas los Objetos Categorie
           almacenados en mi Base de Datos y me los devuelve en formato Json listos para usar en mi FrontEnd.
         */
        resultado = catR.findAll();
        // Aque devuelvo la lista completa de las categorias
        return resultado;
    }



        // Esta funcion esta harcodeada, no modifique nada de esta seccion.
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





}
