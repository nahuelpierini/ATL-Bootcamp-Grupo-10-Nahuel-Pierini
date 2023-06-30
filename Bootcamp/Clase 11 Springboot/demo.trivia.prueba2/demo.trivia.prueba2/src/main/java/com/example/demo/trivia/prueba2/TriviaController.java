package com.example.demo.trivia.prueba2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public String getQuestion(@PathVariable String categoria){
        return "{\n" +
                "  \"category\": \"Cultura\",\n" +
                "  \"question\": \"¿Qué ingredintes se necesitan para hacer una michelada?\",\n" +
                "  \"options\": [\"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante\", \"Cerveza, lima/limón y limon\", \"Cerveza, sal, tabasco y lima/limón\"],\n" +
                "  \"answer\": 0,\n" +
                "  \"explanation\": \"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"\n" +
                "}";
    }

    @GetMapping("/categories")
    public String getCategories(){
        return "[\n" +
                "  {\n" +
                "    \"category\": \"Prueba\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";
    }
}
