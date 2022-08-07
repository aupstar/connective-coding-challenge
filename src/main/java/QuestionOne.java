public class QuestionOne {
    /*PLAN
    Input: Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Constraints/Assumptions:
    each input has exactly one solution
    cannot use same element twice

    Steps: (brute force)
    1. Loop through each input and check if it sums to the target
    2. Break and return indexes when correct sum found

    Complexity: time (n^2) : space O(1)
     */

    /**
     * Gets indices of two items in array that sum to the target
     *
     * @param nums is an unsorted integer array
     * @param target is the integer that we are aiming for when summing the contents of the array
     * @return indices of two items in array that sum to the target
     */
    public int[] getIndicesThatSumToTarget(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) break;
            for (int j = 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) return new int[]{i, j};
            }
        }
        return null;
    }
}
