
import static java.lang.Math.min;

public class TrappingWater {

    public static int trap(int[] height) {
        int size = height.length;

        int currentLeftMax = 0, currentRightMax = height[size - 1], totalArea = 0;
        int [] leftMinHeigths = new int[size];
        int [] rightMinHeigths = new int[size];

        int j = size - 1, i = 0;

        for(; i < size; i++,j--) {
            if(currentLeftMax < height[i]) {
                currentLeftMax = height[i];
            }
            if(currentRightMax < height[j]) {
                currentRightMax = height[j];
            }

            leftMinHeigths[i] = currentLeftMax;
            rightMinHeigths[j] = currentRightMax;
        }


        for(i = 0; i < height.length; i++)
            totalArea += (min(leftMinHeigths[i], rightMinHeigths[i]) - height[i]);

        return totalArea;
    }


    public static void main(String[] args) {
        int[] heights = new int[]{ 0,1,0,2,1,0,1,3,2,1,2,1 };
        System.out.println(trap(heights));
    }

}
