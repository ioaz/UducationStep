package vehicle.work0027;

/**
 * Created by ioa on 19.03.17.
 *
 * Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора
 * и метод бинарного поиска)
 *
 */
public class Main {
    public static void main(String[] args) {
        int x = 20;
        int num = 1;
        int rez = 0;
        while (x > 0) {
            x -= num;
            num += 2;
            rez += (x < 0) ? 0 : 1;
        }
        System.out.println(rez);
    }

}
