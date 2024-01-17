class Solution {
    static void swap(ArrayList<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    static void permutations(Set<ArrayList<Integer>> set, ArrayList<Integer> arr,int index){
        if(index==arr.size()){
            set.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<arr.size();i++){
            swap(arr,i,index);
            permutations(set,arr,index+1);
            swap(arr,i,index);
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Set<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        permutations(set,arr,0);
        for(ArrayList<Integer> curr:set) ans.add(curr);
        Collections.sort(ans,(x,y)->{
            for(int i=0;i<x.size();i++){
                if(x.get(i)!=y.get(i)) return x.get(i)-y.get(i);
            }
            return x.get(x.size())-y.get(y.size());
        });
        return ans;
    }
};
