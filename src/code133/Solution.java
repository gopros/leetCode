package code133;


import java.util.*;

class Solution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        Map<Integer,UndirectedGraphNode> map = new HashMap<>();
        Map<Integer,UndirectedGraphNode> map_new = new HashMap<>();
        List<UndirectedGraphNode> list = new ArrayList<>();
        map.put(node.label,node);
        map_new.put(node.label,new UndirectedGraphNode(node.label));
        list.add(node);
        while (!list.isEmpty()){
            UndirectedGraphNode n = list.get(0);

            for (int i = 0; i < n.neighbors.size(); i++) {

                if (!map.containsKey(n.neighbors.get(i).label)){
                    map.put(n.neighbors.get(i).label,n.neighbors.get(i));
                    map_new.put(n.neighbors.get(i).label,new UndirectedGraphNode(n.neighbors.get(i).label));
                    list.add(n.neighbors.get(i));
                }

            }
            list.remove(0);

        }

        Set<Integer> keys =  map.keySet();
        Iterator<Integer> iterator= keys.iterator();
        while (iterator.hasNext()){
            Integer k = iterator.next();
            List<UndirectedGraphNode> l = map.get(k).neighbors;
            List<UndirectedGraphNode> l_new = map_new.get(k).neighbors;

            for (int i = 0; i < l.size(); i++) {
                l_new.add(map_new.get(l.get(i).label));
            }

        }

        return map_new.get(node.label);



    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
class UndirectedGraphNode {
     int label;
     List<UndirectedGraphNode> neighbors;
     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 };