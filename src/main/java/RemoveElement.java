public class RemoveElement {



    public static int removeElement(int[] nums, int val) {

        int endPointer = nums.length - 1, startPointer = 0;


        while(startPointer < endPointer) {
            if(nums[startPointer] != val) {
                startPointer++;
            } else {
                while(nums[endPointer] == val) {
                    if(startPointer < endPointer) {
                        endPointer--;
                    } else {
                        break;
                    }
                }
                nums[startPointer] = nums[endPointer];
                nums[endPointer] = val;
                startPointer++;
            }
        }

        return startPointer;
    }


    public static int removeElement1(int[] nums, int val) {
        int endPointer = nums.length - 1, startPointer = 0;


        while(startPointer < endPointer) {
            if (nums[startPointer] == val) {
                while (nums[endPointer] == val) {
                    if (startPointer < endPointer) {
                        endPointer--;
                    } else {
                        break;
                    }
                }
                nums[startPointer] = nums[endPointer];
                nums[endPointer] = val;

            }
            startPointer++;

        }
        int i;
        for(i = 0; i < nums.length; i++)
            if(nums[i] == val)
                break;

        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2 };
//        int[] nums = new int[] { 3,2,2, 3 };
        int len = removeElement1(nums, 2);
        System.out.println("Length is : " + len);
        for(int i = 0; i < len; i++)
            System.out.println(nums[i]);

    }

}
