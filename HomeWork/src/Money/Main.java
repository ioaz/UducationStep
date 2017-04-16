package Money;

import java.io.IOException;

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

        Money money = new Money();
        Money convert = money.convert(money.currency);
        convert.add(convert.amount);
        //System.out.println(convert.amount);
        System.out.println(convert.amount);
        System.out.println(money.amount);
    }
}

