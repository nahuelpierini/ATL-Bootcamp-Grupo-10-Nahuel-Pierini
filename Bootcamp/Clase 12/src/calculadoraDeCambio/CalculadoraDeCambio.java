package calculadoraDeCambio;

import java.util.Scanner;

public class CalculadoraDeCambio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese costo del producto: ");
        float precioProducto = scanner.nextFloat();

        System.out.print("Ingrese monto a pagar: ");
        float montoAPagar = scanner.nextFloat();

        float cambio = montoAPagar - precioProducto;

        cambioRecibido(precioProducto, montoAPagar, cambio);
    }

    private static void cambioRecibido(float precioProducto, float montoAPagar, float cambio) {
        if (montoAPagar > precioProducto){
        System.out.printf("Su cambio es de:  %.2f", cambio);
            System.out.println();
            devolucionEnBilletesYMonedas(cambio);
        }

        if (montoAPagar == precioProducto){
            System.out.println("Ha pagado el precio justo");
        }

        if (montoAPagar < precioProducto){
            System.out.println("El precio del producto es de: " + precioProducto + " aún le falta pagar: " + (cambio *(-1)) + " euros");
        }
    }

    public static void devolucionEnBilletesYMonedas(float cambio){
        float[] billetes = {500.0f,200.0f,100.0f,50.0f,20.0f,10.0f,5.0f};
        float[] monedas = {1.0f,0.25f,0.05f,0.01f};
        int[] sumaBilletes = {0,0,0,0,0,0,0};
        int[] sumaMonedas = {0,0,0,0};
        float cambioRedondeado = cambio;

            do {
                cambioRedondeado = Math.round(cambioRedondeado*100)/100f;
                if (cambioRedondeado >= 500) {
                    sumaBilletes[0] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[0];
                } else if (cambioRedondeado < 500 && cambioRedondeado >= 200) {
                    sumaBilletes[1] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[1];
                } else if (cambioRedondeado < 200 && cambioRedondeado >= 100) {
                    sumaBilletes[2] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[2];
                } else if (cambioRedondeado < 100 && cambioRedondeado >= 50) {
                    sumaBilletes[3] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[3];
                } else if (cambioRedondeado < 50 && cambioRedondeado >= 20) {
                    sumaBilletes[4] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[4];
                } else if (cambioRedondeado < 20 && cambioRedondeado >= 10) {
                    sumaBilletes[5] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[5];
                } else if (cambioRedondeado < 10 && cambioRedondeado >= 5) {
                    sumaBilletes[6] += 1;
                    cambioRedondeado = cambioRedondeado - billetes[6];
                } else if (cambioRedondeado<5 && cambioRedondeado>=1){
                    sumaMonedas[0] +=1;
                    cambioRedondeado = cambioRedondeado - monedas[0];
                } else if(cambioRedondeado<1 && cambioRedondeado>=0.25f){
                    sumaMonedas[1] += 1;
                    cambioRedondeado = cambioRedondeado - monedas[1];
                } else if(cambioRedondeado<0.25f && cambioRedondeado >=0.05f){
                    sumaMonedas[2] += 1;
                    cambioRedondeado = cambioRedondeado - monedas[2];
                } else if(cambioRedondeado<0.05f && cambioRedondeado >=0.01f){
                    sumaMonedas[3] += 1;
                    cambioRedondeado = cambioRedondeado - monedas[3];
                }
            }while(cambioRedondeado != 0);

            for (int i=0; i<sumaBilletes.length; i++){
                if (sumaBilletes[i] == 1){
                    System.out.println("Debe devolver :" + sumaBilletes[i] + " billete de: " + billetes[i] + " euros");
                }else if(sumaBilletes[i] !=0){
                    System.out.println("Debe devolver :" + sumaBilletes[i] + " billetes de: " + billetes[i] + " euros");
                }
            }
        for (int i=0; i<sumaMonedas.length; i++){
            if (sumaMonedas[i] == 1){
                System.out.println("Debe devolver :" + sumaMonedas[i] + " moneda de: " + monedas[i] + " euros");
            }else if(sumaMonedas[i] !=0){
                System.out.println("Debe devolver :" + sumaMonedas[i] + " monedas de: " + monedas[i] + " euros");
            }
        }
    }

}
