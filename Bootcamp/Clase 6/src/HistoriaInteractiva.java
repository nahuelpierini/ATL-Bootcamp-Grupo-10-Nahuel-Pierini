import java.util.Scanner;

public class HistoriaInteractiva {
    public static void main(String [] args) {

        System.out.println("HISTORIA INTERACTIVA ELEGIR LA OPCION QUE LE PAREZCA");
        System.out.println("Juan camina por el bosque hay dos rutas,  (1) un camino directo al bosque y  (2) otro una calle asfaltada:  ");
        System.out.print("Ingrese opcion 1 o 2: ");
        Scanner scanner = new Scanner(System.in);
        int camino = scanner.nextInt();
        if (camino == 1){
            System.out.println("Sigue caminando y se encuentra muchos arboles y animales, al final encuentra una casa rosada, decide (3) entrar a la casa o (4) seguir camino");
            System.out.print("Ingrese opcion 3 o 4: ");
            camino   = scanner.nextInt();
            if (camino == 3){
                System.out.println("Entra a la casa encuentra 100000 euros y decide seguir hasta encontrar su camino a casa");
            }else{
                System.out.println("Decide ignorar y encuentra camino a su casa sin aventurarse a la misteriosa casa");
            }

        }else if(camino == 2){
            System.out.println("Sigue por el camino de cemento, se encuentra una parada de bus se sube y se va  su casa");
        }

    }
}
