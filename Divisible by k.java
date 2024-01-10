class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
         int[] remainderArray = new int[k];
        int maxLen = 0;
        int currentSum = 0;

        // Initialize the remainderArray with -1 to represent the initial state
        Arrays.fill(remainderArray, -1);

        for (int i = 0; i < n; i++) {
            currentSum += a[i];

            int remainder = (currentSum % k + k) % k;

            if (remainder == 0) {
                maxLen = i + 1;
            } else {
                if (remainderArray[remainder] == -1) {
                    remainderArray[remainder] = i;
                } else {
                    maxLen = Math.max(maxLen, i - remainderArray[remainder]);
                }
            }
        }

        return maxLen;
       
    }
 
}
