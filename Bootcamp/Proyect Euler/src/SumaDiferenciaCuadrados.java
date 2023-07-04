public class SumaDiferenciaCuadrados {

    public static void main(String args[]){
        int suma1 =0;
        int suma=0;
        int suma2;

        for (int i=1; i<=100; i++){
            suma1 += (i*i);
        }

        for (int i=1; i<=100; i++){
            suma += i;
        }
        suma2 = suma*suma;

        System.out.println(suma2-suma1);

    }
}
