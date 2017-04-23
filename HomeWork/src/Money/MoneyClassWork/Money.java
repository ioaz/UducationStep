package Money.MoneyClassWork;

/**
 * Created by ioa on 18.04.17.
 */
public class Money {
    private double amount;
    private String currency;

    private final static double EUR = 60;

    Money (double amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Money convert (String currency){
        if (currency.equals("EUR")){
            return new Money(amount / EUR, currency);
        }
        else if (currency.equals("RUB")) {
            return new Money(amount * EUR, currency);
        }
        else {
            return null;
        }
    }

    public Money add (Money money){
        if (money.currency.equals(this.currency)){
            return new Money(money.amount + amount, currency);
        }
        return null;
    }

    @Override
    public String toString(){
        return "Currensy: " + currency + " Ammount: " + amount;
    }
}
