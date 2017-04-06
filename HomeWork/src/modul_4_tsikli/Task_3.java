package modul_4_tsikli;

/**
 * Created by ioa on 06.04.17.
 *
 * Задание 3
 * В американской армии считается несчастливым число 13, а в китайской — 4.
 * Перед совместными  учениями с украинской и китайской армией,  штаб украинской
 * армии решил исключить номера боевой техники, содержащие числа 4 или 13
 * (например, 40123, 13373, 12345 или 61342), чтобы не смущать иностранных коллег.
 * Написать программу, которая определит сколько номеров придется исключить,
 * если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина
 * имеет номер от 00001 до 99999. Дополнительно вывести на экран все номера,
 * которые необходимо исключить.
 */
public class Task_3 {

    public static void main(String[] args) {
        String[] arr = new String[100000];
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                str = "0000" + i;
                arr[i] = str;
            } else if (i < 100) {
                str = "000" + i;
                arr[i] = str;
            } else if (i < 1000) {
                str = "00" + i;
                arr[i] = str;
            } else if (i < 10000) {
                str = "0" + i;
                arr[i] = str;
            } else {
                str = "" + i;
                arr[i] = str;
            }
        }
        int counter = 0;

        String[] arrnations = new String[100000];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].indexOf('4') != -1 || arr[i].indexOf("13") != -1){
                str = arr[i];
                //System.out.println(str);
                //System.out.println(arr[i] + " not 4");
                counter++;
                arrnations[i] = str;
                System.out.println(arrnations[i] + " ");

            }
        }
        System.out.println("Выше номера, которые прийдется исключить. Всего " + counter + ".");
    }
}
