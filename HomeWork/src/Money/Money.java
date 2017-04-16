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
    char currency;

    static final double USD = 56.96;
    static final double EUR = 60.30;
    static final double CNY = 82.51;

    public Money() {
    }

    public Money(double amount) {
        this.amount = amount;
    }

    public Money convert (char currency) throws IOException {
        System.out.print("Введите сумму в рублях: ");
        amount = scanner.nextDouble();

        System.out.println("Выберите валюту в котурую конвертируем: ");
        System.out.println(" 1. USA");
        System.out.println(" 2. EUR");
        System.out.println(" 3. CNY");

        currency = (char) reader.read();

        switch (currency){
            case '1':
                this.amount = amount / USD;
                System.out.println(this.amount + " USA");
                return new Money(amount);
            case '2':
                this.amount = amount / EUR;
                System.out.println(this.amount + " EUR");
                return new Money(amount);
            case '3':
                this.amount = amount / CNY;
                System.out.println(this.amount + " CNY");
                return new Money(amount);
        }
        return null;
    }

    public void add(double convert){
        amount = scanner.nextDouble();
        this.amount = convert + amount;
        System.out.println(amount);

    }
    public double subtract(){

        return 0;
    }
    public double multiple(){

        return 0;
    }
    public double divide(){

        return 0;
    }
}

