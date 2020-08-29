package Homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {

        int[] sample = new  int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for (i = 0; i < sample.length; i++) ;

        {

            if (sample[i] == 0) {
                sample[i] = 1;
            } else {
                sample[i] = 0;
            }
        }
        System.out.println(Arrays.toString(sample));
    }
}