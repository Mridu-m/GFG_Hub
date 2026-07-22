class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        //  0  1  2  3  4  4   5   6
        // [1, 3, 4, 7, 9, 9, 12, 56] m=5
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int prev_idx = 0;
        for(int i=(m-1); i<arr.length; i++) {
            min = Math.min(min, arr[i] - arr[prev_idx]);
            prev_idx++;
        }
        return min;
    }
}