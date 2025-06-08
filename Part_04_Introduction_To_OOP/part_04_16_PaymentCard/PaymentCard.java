package Part_04_Introduction_To_OOP.part_04_16_PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably(){
        double eatAffordably = 2.6;
        if(this.balance >= eatAffordably){
            this.balance = this.balance - eatAffordably;
        }
    }

    public void eatHeartily(){
        double eatHeartily = 4.6;
        if(this.balance >= eatHeartily){
            this.balance = this.balance - eatHeartily;
        }
    }

    public void addMoney(double amount){
        if(amount > 0 && this.balance + amount < 150){
            this.balance = this.balance + amount;
        } else if (amount > 0 && this.balance + amount > 150){
            this.balance = 150;
        }
    }
}
