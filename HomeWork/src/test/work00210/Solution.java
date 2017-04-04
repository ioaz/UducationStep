package test.work00210;

/**
 * Created by ioa on 20.03.17.
 *
 * Вывести число, которое является зеркальным отображением последовательности цифр заданного числа,
 * например, задано число 123, вывести 321.
 *
 */
public class Solution {
    public static void main(String[] args) {
        Integer num = 123;
        String s = num.toString();
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        s = str.toString();
        num = Integer.valueOf(s);
        System.out.println(num);
    }
}
