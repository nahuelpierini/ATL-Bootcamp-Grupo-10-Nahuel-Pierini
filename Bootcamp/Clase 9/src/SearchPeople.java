import java.util.Scanner;

public class SearchPeople {
    public static void main(String[] args){

        //Search People
        System.out.print("Search people by Name or something similar: ");
        Scanner scanner = new Scanner(System.in);
        String nameAdded = scanner.nextLine();

        String[] names = {
                "Nahuel Pierini",
                "Juan Manuel De Rosas",
                "Jeronimo Artiagas",
                "Esteban Quito",
                "Fuasto Del Bosque",
                "Florencia Floricienta",
                "Martin Guzman"
        };

        for(String name : names){
            if(name.toLowerCase().contains(nameAdded.toLowerCase()))
                System.out.print(name + "\n");
        }
    }
}
