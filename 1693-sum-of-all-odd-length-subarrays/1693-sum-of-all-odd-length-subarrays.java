class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];

        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        int totalSum = 0;
        for (int len = 1; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i++) {
                totalSum += prefixSum[i + len] - prefixSum[i];
            }
        }

        return totalSum;
    }
}