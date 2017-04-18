package Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" 1. USA");
        System.out.println(" 2. EUR");
        System.out.println(" 3. CNY");
        System.out.print("Выберете валюту (select one): ");
        String currency = reader.readLine();
        System.out.print("Введите сумму в рублях: ");
        double amountRUB = Integer.parseInt(reader.readLine());

        Money mymoney = new Money(amountRUB, currency);
        Money convert = mymoney.convert(mymoney.currency);
        convert.amount = mymoney.am;
        mymoney.add();
        convert = mymoney.convert(mymoney.currency);
        convert.amount = convert.am;

    }
}

