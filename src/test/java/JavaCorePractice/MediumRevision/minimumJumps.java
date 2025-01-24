package JavaCorePractice.MediumRevision;
/*
given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

For example:

If arr[i] = 3, you can jump 1 step, 2 steps, or 3 steps forward from position i.
If arr[i] = 0, you cannot jump forward from that position.
Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.

Note:  Return -1 if you can't reach the end of the array.

Examples :

Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3
Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last.
 */
public class minimumJumps {
    public static void main(String args[])
    {
    int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    int minimumJumps=minJumps(arr);
    System.out.println("min jumps required is = "+minimumJumps);
    }
    static int minJumps(int[] arr) {
        // code here
        int target = arr.length;
        // If the array has only one element, no jump is needed
        if (target <= 1) return 0;

        // If the first element is 0, we can't move anywhere
        if (arr[0] == 0) return -1;

        int minJump=1;// At least one jump is needed initially
        int farthest = arr[0]; // Farthest we can reach
        int currEnd = arr[0];  // Current jump's range


        for(int i =1 ; i<target;i++){
            // If we've reached the last index, return jumps
            if (i == target - 1) return minJump;

            // Keep on Updating the 'farthest' we can reach
            farthest = Math.max(farthest, i + arr[i]);

            // If we reach the end of the current jump range
            if (i == currEnd) {
                minJump++;
                currEnd = farthest;
            }

            // If the current range doesn't extend further, we can't proceed
            if (currEnd <= i) return -1;
        }


        return -1; // If we exit the loop without reaching the last index
    }
}

