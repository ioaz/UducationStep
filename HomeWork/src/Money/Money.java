package Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ioa on 12.04.17.
 * "Создать класс представление денег (Money).
 * Должен содержать два поля: - сумма (amount) - валюта (currency)
 * добавить метод для конвертации (convert) который в качестве параметра
 * должен принимать строку с указанием валюты в которую конвертируем,
 * возвращать должен новый объект Money с конвертированной суммой и валютой.
 * Сделать возможность конвертировать в несколько валют. Если курс
 * конвертации не найден - возвращать null;
 * текущий курс задать константами внутри класса
 * написать методы для арифметических операций с деньгами
 * (add, subtract, multiple, divide)"
 */
public class Money {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);

    double amount;
    String currency;
    double am;
    String v;
    static final double USD = 56.96;
    static final double EUR = 60.30;
    static final double CNY = 82.51;

    Money(double amount, String currency)  {
        this.amount = amount;
        this.currency = currency;
    }

    Money(double amount) {
        am = amount;
    }

    public Money convert(String curr) throws IOException {
        //System.out.print("Введите сумму в рублях: ");
        //amount = scanner.nextDouble();
        curr = currency;
        switch (curr) {
            case "1":
                am = amount / USD;
                System.out.println(amount + "р. = " + am + "$");
                return new Money(amount);
            case "2":
                am = amount / EUR;
                System.out.println(amount + "р. = " + am + "EUR");
                return new Money(amount);
            case "3":
                am = amount / CNY;
                System.out.println(amount + "р. = " + am + "CNY");
                return new Money(amount);
        }

        return null;
    }

    double add() throws IOException {
        System.out.println("Желаете изменить сумму? (y / n)");
        v = reader.readLine();
        switch (v) {
            case "y":
                System.out.print("Введите новую сумму: ");
                this.amount = Integer.parseInt(reader.readLine());
                System.out.println("Желаете изменить валюту? (y / n)");
                v = reader.readLine();
                switch (v) {
                    case "y":
                        changeCurr();
                        break;
                }
                return this.amount;

            case "n":
                System.out.println("Желаете изменить валюту? (y / n)");
                v = reader.readLine();
                switch (v) {
                    case "y":
                        changeCurr();
                        break;
                }
                break;
        }
        return this.amount;
    }

    void changeCurr() throws IOException {
        System.out.println(" 1. USA");
        System.out.println(" 2. EUR");
        System.out.println(" 3. CNY");
        System.out.print("Выберите новую валюту: ");
        currency = reader.readLine();
    }

}

