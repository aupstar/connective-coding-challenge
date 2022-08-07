import static java.lang.Math.max;
import static java.lang.Math.min;

public class QuestionTwo {
    /*
        PLAN
        Input: array of heights [1,8,6,2,5,4,8,3,7]
        Output: max water level/area integer 49
        Constrains/Assumptions: Cannot slant the container

        Steps:
        1. using the heights at the start/end of the array, calculate the max area given the minimum height
        2. scope for larger heights at other indexes by incrementing/decrementing the left/right indexes

        Complexity: time O(n): space O(1)
     */

    /**
     * Gets the area of the max water level given an array of heights
     *
     * @param height is an integer array of hights
     * @return integer maximum of area/water level given the array of heights
     */
    public int getMaxWaterLevel(int[] height) {
        int l_index = 0, area = 0;
        int r_index = height.length - 1;

        while (l_index < r_index) {
            area = max(area, min(height[l_index], height[r_index]) * (r_index - l_index));
            if (height[l_index] < height[r_index]) l_index += 1;
            else r_index -= 1;
        }

        return area;
    }
}
