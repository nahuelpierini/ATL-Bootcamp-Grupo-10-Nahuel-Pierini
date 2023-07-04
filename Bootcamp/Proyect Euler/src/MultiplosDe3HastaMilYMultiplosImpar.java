public class MultiplosDe3HastaMilYMultiplosImpar {

    public static void main(String [] args){

        int suma =0;

        int sumaImpar =0;

        for(int i=3; i<1000;i++){
            if((i%3) == 0){
                suma+=i;
            }
        }

        System.out.println(suma);

        for(int i=1; i<1000;i++){
            if((i%2) != 0){
                sumaImpar+=i;
            }
        }

        System.out.println(sumaImpar);



    }
}
