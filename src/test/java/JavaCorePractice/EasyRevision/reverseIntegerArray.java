package JavaCorePractice.EasyRevision;

import java.util.Arrays;

//Write a method that will take an array as an argument and reverse it.
public class reverseIntegerArray {

    public static void main(String args[])
    {
        int[] inputArr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(inputArr)); // [1, 2, 3, 4, 5]
        reverseIntArray(inputArr);
        System.out.println(Arrays.toString(inputArr)); // [5, 4, 3, 2, 1]
    }
    public static void reverseIntArray(int nums[])
    {
        int left=0,right = nums.length-1;
        while(left<right)
        {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left ++;
            right--;
        }
    }
}
