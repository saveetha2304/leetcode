class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int lucky = -1;

        for (int i = 0; i < n; i++) {
            int count = 1;

            if (arr[i] == -1)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            if (arr[i] == count) {
                if (arr[i] > lucky) {
                    lucky = arr[i];
                }
            }
        }

        return lucky;
    }
}