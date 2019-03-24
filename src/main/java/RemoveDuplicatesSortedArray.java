public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int unDuplicateLength = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[unDuplicateLength] != nums[i]) {
                unDuplicateLength++;
                nums[unDuplicateLength] = nums[i];
            }
        }

        return  unDuplicateLength  + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0 };
        int len = removeDuplicates(nums);
        for(int i = 0; i < len; i++)
            System.out.println(nums[i]);
    }

}
