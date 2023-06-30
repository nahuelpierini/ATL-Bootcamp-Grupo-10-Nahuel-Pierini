public class Account {
    private String holder;
    private float amount;

    public Account() {
    }

    public Account(String holder, float amount) {
        this.holder = holder;
        this.amount = amount;
    }



    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", amount=" + amount +
                '}';
    }



    public float deposit(float amountDeposited){
        if (amountDeposited>0) {
            amount += amountDeposited;
        }
        return amount;
    }

    public float withdraw(float amountWithdrawn){

        return amount-=amountWithdrawn;

    }


}
