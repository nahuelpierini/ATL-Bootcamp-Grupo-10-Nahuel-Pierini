package com.example.demo.trivia.prueba2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public  String  getQuestion(@PathVariable String categoria){
        ChatGptClient chatGpt = new ChatGptClient();
        String respuestaJson = chatGpt.enviarPregunta("Estoy armando una trivia, necesito que me des una pregunta de la categoria " + categoria + ", con la siguiente estructura de JSON. LA respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:\n" +
                "\n" +
                "{\n" +
                "  \"category\": \"aca va el nombre de la categoria\",\n" +
                "  \"question\": \"aca va la pregunta\",\n" +
                "  \"options\": [\n" +
                "    \"aca va la opcion 1\",\n" +
                "    \"aca va la opcion 2\",\n" +
                "    \"aca va la opcion 3\"\n" +
                "  ],\n" +
                "  \"answer\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\n" +
                "  \"explanation\": \"aca tienes que poner una explicacion diciendo porque es la respuesta correcta\"\n" +
                "}");


        return respuestaJson;

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
