package Class_practice.class8_17;

public class demo_23 {
    public static void main(String[] args) {
        Card a1 = new Card(100);
        a1.setPassword("888888");
        System.out.println(a1.getBalance());
    }
}

class Card{
    private String cardID;
    private String password;
    private double balance;
    public Card(double balance){
        cardID = "6222620350002435264";
        password = "111111";
        this.balance = balance;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }
}
