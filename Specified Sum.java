//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/



    class Solution
{
    public static void solve(Node root,int s,int sum,ArrayList<Integer>al,ArrayList<ArrayList<Integer>>ans)
    {
        if(root==null)
        {
            return;
        }
        s+=root.data;
        al.add(root.data);
        if(sum==s)
        {
            ans.add(new ArrayList<>(al));
        }
        solve(root.left,s,sum,al,ans);
        solve(root.right,s,sum,al,ans);
        al.remove(al.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        //code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(root,0,sum,new ArrayList<>(),ans);
        return ans;
    }
}
