public class Main {
    public static void main(String[] args){

        Account account = new Account("Juan",500.0f);
        account.deposit(870);
        account.withdraw(50);


        System.out.println(account.toString());

    }
}
