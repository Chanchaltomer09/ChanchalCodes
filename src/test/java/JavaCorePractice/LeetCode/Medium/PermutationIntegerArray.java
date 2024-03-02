package JavaCorePractice.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;
//for given input nums[] , find list of all possible permutation

//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
public class PermutationIntegerArray {
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList(), nums);
        return result;
    }
    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> s, int[]nums)
    {
        if(nums.length==s.size())
        {
            result.add(new ArrayList(s));
            return;
        }
        for(int number: nums)
        {
            if(s.contains(number))
                continue;
            s.add(number);
            backtrack(result, s, nums);
            s.remove(s.size()-1);
        }
    }
    public static void main(String args[])
    {
        List<List<Integer>> result = new ArrayList<>();
        int []nums= new int[]{1,2,3};
        result = permute(nums);
        System.out.println(result);
    }

}
