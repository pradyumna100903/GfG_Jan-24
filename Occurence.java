class Solution {
    static int singleElement(int[] arr , int N) {
        int ans=0;
        for(int i=0;i<=32;i++)
        {
            int x=1<<i;  // (if i=0,x=2^0)  ( if i=1,x=2^1)
            int sum=0;
            
            for(int j=0;j<N;j++)
            {
                if((arr[j]&x)!=0)
                {
                    sum++;
                }
            }
            
            if(sum%3!=0)
            {
                ans=ans|x;
            }
        }
        return ans;
    }
}
