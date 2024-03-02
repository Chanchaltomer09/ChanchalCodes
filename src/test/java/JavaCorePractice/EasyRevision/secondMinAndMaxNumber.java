package JavaCorePractice.EasyRevision;

import java.util.Arrays;

public class secondMinAndMaxNumber {

        public static void main(String[] args)
        {
            System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 103
            System.out.println(secMax(new int[] {3, 4})); // 3

            System.out.println("------");
            System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 8
            System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 2
            System.out.println(secMin(new int[] {3, 4})); // 4

        }

    public static int secMax(int[] arr) {
        // 1. Find index of the biggest element
        int maxIndex = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // assume that second max is the smallest possible value for int
        // it is done to make we do not get real max by different assumption
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // i not equals to maxIndex will ensure not to get the biggest element.
            if (i != maxIndex && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        // return second biggest
        return secondMax;
    }

    public static int secMin(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return second element. Array is soreted from smallest to biggest
        return numArr[1];
    }

}
