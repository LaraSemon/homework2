package Homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        int i;
        int[] sample = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (i = 0; i < sample.length; i++) {
            if (sample[i] == 0) {
                sample[i] = 1;
            } else
                sample[i] = 0;

        }
        System.out.println(Arrays.toString(sample));
    }


    public static void stepByStep() {
        int i;
        int[] arr = new int[8];
        String[] stringsArr = new String[8];

        for (i = 0; i < arr.length; i += 3) {
            System.out.println(Arrays.toString(new String[]{arr[i] + " "});
            arr[i]+=3;
        }
    }
}

