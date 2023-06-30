public class RandomPassword {
    public static void main (String[] args){

        String password = randomPassword();
        System.out.print(password);
    }

    public static String randomPassword(){
        long random = Math.round((Math.random()*1000000));
        String stringRandom = "Daskgrjkg§";
        return stringRandom + random;
    }
}
