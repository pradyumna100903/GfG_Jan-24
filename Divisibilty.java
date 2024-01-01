class Solution {
    public boolean canPair(int[] nums, int k) {
         int n=nums.length;
        if(n%2!=0)return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            int rem=((i%k)+k)%k;
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        
        for(int i:nums)
        {
            int rem=((i%k)+k)%k;
            int com=(k-rem)%k;
            if(hm.containsKey(com)){
                int count=hm.get(rem)+hm.get(com);
                if(count%2!=0)return false;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

