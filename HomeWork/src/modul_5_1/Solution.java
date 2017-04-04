package modul_5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by ioa on 27.03.17.
 *
 *
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        /**
         * Написать программу подсчитывающее количество слов,
         * гласных и согласных букв в строке введеной пользователем.
         * Дополнительно выводить количество знаков пунктуации, цифр и др. символов.
         * Пример вывода программы:
         Всего символов – 38 из них:
         Слов – 6
         Гласных 12
         Согласных 24
         Знаки пунктуации -2
         Цифр – 0
         Др. символов – 0
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int word = 0, soglas = 0, glas = 0, znaki = 0, numbers = 0, other = 0;
        char[] arrnumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] arrglas = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        char[] arrsoglass = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н',
                'п', 'р', 'с', 'т', 'ф', 'ч', 'ц', 'ч', 'ш', 'щ'};
        char[] arrznaki = {'.', ',', ';', ':', '/', '!', '?', '-', '_', '(', ')', '[', ']', '"'};
        char[] arrother = {'ь', 'ъ'};
        for (int i = 0; i < str.length(); i++) {
            String strlow = str.toLowerCase();
            char ch = strlow.charAt(i);

            ArrayList<String> arrlist = new ArrayList<String>();

            StringTokenizer tokenizer = new StringTokenizer(str);
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                arrlist.add(token);
                word = arrlist.size();
            }

            if (ch == ' ') {
                word += 1;
            }
            for (int j = 0; j < arrglas.length; j++) {
                if (ch == arrglas[j]) {
                    glas += 1;
                }
            }
            for (int n = 0; n < arrnumbers.length; n++) {
                if (ch == arrnumbers[n]) {
                    numbers += 1;
                }
            }
            for (int s = 0; s < arrsoglass.length; s++) {
                if (ch == arrsoglass[s]) {
                    soglas += 1;
                }
            }
            for (int z = 0; z < arrznaki.length; z++) {
                if (ch == arrznaki[z]) {
                    znaki += 1;
                }
            }
            for (int o = 0; o < arrother.length; o++) {
                if (ch == arrother[o]) {
                    other += 1;
                }
            }
        }
        System.out.println("Всего символов - " + str.length() + " из них:\nСлов - " + word +
                "\nГласных - " + glas + "\nСогласных - " + soglas + "\nЗнаки пунктуации - " + znaki +
                "\nЦифр - " + numbers + "\nДр. символов - " + other);
    }
}

