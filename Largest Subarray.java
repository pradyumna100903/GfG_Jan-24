class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
     long sum=0;
        for (int i=0;i<k;i++){
            sum+=a[i];
        }
        if (n==k){
            return sum;
        }
        long max=sum;
        long initial=0;
        for (int i=(int)k;i<n;i++){
            sum+=a[i];
            sum-=a[i-(int)k];
            initial+=a[i-(int)k];
            if (initial>=0){
                max=Math.max(sum+initial,max);
            }
            else{
                max=Math.max(max,sum);
                initial=0;
            }
        }
        return max;   
    }
}
