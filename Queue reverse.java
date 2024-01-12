class GfG {
    
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
          Stack<Integer> st1 = new Stack<>();
        int i = 0;
        while(!q.isEmpty() && i<k){
            st1.push(q.remove());
            i++;
        }
        
        Queue<Integer> ans = new LinkedList<>();
        
        while(!st1.isEmpty()){
            ans.add(st1.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.remove());
        }
        
        return ans;
    }
}
