import java.util.HashSet;

public class TwoSum {

    public static void  main(String[] args) {
        int[] nums = new int[]{ 3,2,4 };
        int target = 6;

        Solution s = new Solution();
        int[] res = s.twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

}

class Solution {


    public int findBetterHalf(int[] nums, int betterHalf) {
        for(int i = 0; i < nums.length; i++)
            if (nums[i] == betterHalf)
                return i;
        return  -1;
    }

    public int[] twoSum(int[] nums, int target) {

        HashSet<Integer> betterHalfHash = new HashSet<Integer>();

        int[] res = new int[2];

        for(int i : nums) {
            betterHalfHash.add(i);
        }
        int len  = nums.length;
        int otherHalf;

        for(int i = 0; i < len; i++) {
            otherHalf = target - nums[i];
            if(betterHalfHash.contains(otherHalf)) {
                System.out.println();
                res[0] = i;
                res[1] = findBetterHalf(nums, otherHalf);
                if(res[0] != res[1])
                    return res;
            }
        }
        return res;
    }
}
