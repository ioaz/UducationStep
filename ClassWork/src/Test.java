/**
 * Created by ioa on 25.04.17.
 */

public class Test
{
    public static void leftshift(int i, int j)
    {
        i >>= j; // i = i << j
        System.out.println(i);
    }
    public static void main(String args[])
    {
        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(i);
    }
}






