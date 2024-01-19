class Solution {
    public static ArrayList<ArrayList<Integer>> kTop(int[] a, int N, int k) {
       
        final Map<Integer, Integer> map = new HashMap<>();


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> partial = null;
        int i = 0;
        for (var num : a) {
            if (num==0)
                break;
            map.put(num, map.getOrDefault(num, 0) + 1);
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt((Integer x) -> map.get(x)).thenComparing(y -> -y));
            for (var key : map.keySet()) {
                pq.offer(key);
                if (pq.size() > k)
                    pq.poll();
            }
            partial = new ArrayList<>();
            while (!pq.isEmpty()) {
                partial.add(pq.poll());
            }

            Collections.reverse(partial);


            list.add(partial);
            ++i;

        }
        return list;
    }
}
        
