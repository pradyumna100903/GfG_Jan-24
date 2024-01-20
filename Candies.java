//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/


class Solution
{
 int steps=0;
    public int distributeCandy(Node root)
    {
        helperFun(root);
        return steps;
    }
    public int helperFun(Node root){
        if(root==null) return 0;
        int l=helperFun(root.left);
        int r=helperFun(root.right);
        steps+=Math.abs(l)+Math.abs(r);
        return (l+r+root.data-1);       
    }
}

