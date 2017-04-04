package modul_4_tsikli;

/**
 * Created by ioa on 03.04.17.
 * Задание 2
 * Электронные часы показывают время в формате от 00:00 до 23:59.
 * Написать программу которая подсчитает, сколько раз за сутки случается так,
 * что слева от двоеточия показывается симметричная комбинация для той,
 * что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 * Вывести на экран все симметричные комбинации.
 */
public class Solution2 {
    public static void main(String[] args) {
        int hh = 24;
        int mm = 60;
        String str = "";
        String[][] arr = new String[24][60];
        String[] arrbuf = new String[1];
        String[] arrsim = new String[17];
        for (int i = 0; i < hh; i++){
            for (int j = 0; j < mm; j++){
                if (i < 10 && j < 10) {
                    //System.out.println("0" + i + ":" + "0" + j);
                    str = "0" + i + ":" + "0" + j;
                    arr[i][j] = str;
                }
                else if (i < 10 ) {
                    //System.out.println("0" + i + ":" + j);
                    str = "0" + i + ":" +j;
                    arr[i][j] = str;
                }
                else if (j < 10) {
                    //System.out.println(i + ":" + "0" + j);
                    str = i + ":" + "0" + j;
                    arr[i][j] = str;
                }
                else {
                    //System.out.println(i + ":" + j);
                    str = i + ":" + j;
                    arr[i][j] = str;
                }
            }
        }
        int counter1 = 0;
        for (int i = 0; i < hh; i++) {
            for (int j = 0; j < mm; j++) {
                //System.out.println(arr[i][j] + " ");
                arrbuf[0] = arr[i][j];
                String ch = arrbuf[0];
                char[] arrch = ch.toCharArray();
                //System.out.println(arrch[0] + "" + arrch[1] + ""+ arrch[2] + ""+ arrch[3] + ""+ arrch[4] + "");
                int counter = 0;
                for (int t = 0; t < ch.length(); t++){
                    if (arrch[t] == arrch[arrch.length-t-1]) {
                        counter++;
                    }
                    if (ch.length() == counter) {

                        counter1++;
                        System.out.print( "\"" + ch + "\"\n");
                    counter=0;
                    }
                }
            }
        }
        System.out.println("Cимметричных комбинаций: " + counter1 );
    }
}
