package homework_week_9;
/*3. Write a Java program to reverse an array of integer values.*/

import java.sql.Array;
import java.util.Arrays;

public class Programme_3 {
    public static void main(String[] args) {
        int[] number1 = {2, 3, 5, 7, 8, 9};
        System.out.println("origanal array =" + Arrays.toString(number1));
        for (int i = 0; i < number1.length / 2; i++) {
            int tem = number1[i];
            number1[i] = number1[number1.length - i - 1];
            number1[number1.length - i - 1] = tem;

        }
        System.out.println("revers array is == " + Arrays.toString(number1));
    }
}