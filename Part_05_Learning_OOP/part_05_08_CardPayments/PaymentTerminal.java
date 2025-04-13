package Part_05_Learning_OOP.part_05_08_CardPayments;

public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 2.50;
        if(payment >= meal){
            double transaction = payment -meal;
            this.money = this.money + meal;
            affordableMeals++;
            return transaction;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 4.30;
        if(payment >= meal){
            double transaction = payment - meal;
            this.money = this.money + meal;
            heartyMeals++;
            return transaction;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card){
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double meal = 2.50;
        if((card.balance() - meal) >= 0){
            card.takeMoney(meal);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card){
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double meal = 4.30;
        if((card.balance() - meal) >= 0){
            card.takeMoney(meal);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            this.money = money + sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
