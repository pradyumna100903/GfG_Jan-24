class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        Set<String>set = new HashSet<>();
        for(int i=0;i<m;i++){
            String key = "";
            for(int j=0;j<n;j++){
                key += matrix[i][j];
            }
            if(set.contains(key)){
                ans.add(i);
            }else{
                set.add(key);
            }
        }
        return ans;
    }
}
