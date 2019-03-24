
import static java.lang.Math.min;
public class maxWaterArea {


    private static int getArea(int start, int end, int[] heights) {
        int height = min(heights[start], heights[end]);
        int width = end - start;
        return width * height;
    }

    public static int maxArea(int[] heights) {
        int start = 0, end = heights.length - 1;
        int maxArea = -1, area;
        while (start < end) {
            area = getArea(start, end, heights);
            if (maxArea < area)
                maxArea = area;
            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;

    }
    public static void main (String[]args){
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heights));
    }
}
