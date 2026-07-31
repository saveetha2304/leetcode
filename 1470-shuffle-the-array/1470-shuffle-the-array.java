class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n + i; j < nums.length; j += n) {
                ans[k] = nums[i];
                k++;
                ans[k] = nums[j];
                k++;
            }
        }

        return ans;
    }
}