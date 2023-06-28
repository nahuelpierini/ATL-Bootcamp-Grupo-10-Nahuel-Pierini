import java.util.Scanner;

public class LlamarPorWasap {

    public static void main(String[] args){
        System.out.print("Ingrese una celular sin espacios para llamar por WhatsApp: ");
        Scanner scanner = new Scanner(System.in);
        int celular = scanner.nextInt();

        System.out.print("https://api.whatsapp.com/send?phone=" + celular);


    }
}