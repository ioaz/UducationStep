package Money.MoneyClassWork;

/**
 * Created by ioa on 18.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Money mymoney = new Money(5000, "RUB");
        Money mymoney1 = new Money(3423, "RUB");

        System.out.println(mymoney);
        System.out.println(mymoney1);
        System.out.println(mymoney.convert("EUR"));
        System.out.println(mymoney.add(mymoney1));
        System.out.println(mymoney.add(mymoney.convert("EUR")));
    }
}
