public class JumpGame {

    public static boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        int currentReachableIndex = lastIndex, maxJump;
        for(int j = lastIndex - 1; j >= 0; j--) {
            maxJump = nums[j];
            if( maxJump + j >= currentReachableIndex || maxJump + j >= lastIndex)
                currentReachableIndex = j;
        }
        return currentReachableIndex == 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 4,2,1,0,1,4 };
        System.out.println("Is Reachable : " + canJump(nums));
    }



}
