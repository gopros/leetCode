package code146;


import java.util.*;

class Solution {



    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);
        cache.put(2,1);
        cache.put(1,1);
        cache.put(2,3);
        cache.put(4,1);
        System.out.println(cache.get(2));


    }



}
class LRUCache {

    private int capacity;
    private int curNum = 0;
    private Map<Integer,Node> map = new HashMap<>();
    private List<Node> list = new ArrayList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }

        list.remove(map.get(key));
        list.add(0,map.get(key));

        return map.get(key).v;


    }

    public void put(int key, int value) {

        if (curNum<capacity){
            Node node = new Node(key,value);
            if (map.containsKey(key)){
                list.add(0,node);
                list.remove(map.get(key));
                map.remove(key);
                map.put(key,node);
                return;
            }

            list.add(0,node);
            map.put(key,node);
            curNum+=1;
        }else if (curNum==capacity){
            Node node = new Node(key,value);
            if (map.containsKey(key)){
                list.add(0,node);
                list.remove(map.get(key));
                map.remove(key);
                map.put(key,node);
                return;
            }

            list.add(0,node);
            map.remove(list.get(list.size()-1).k);
            map.put(key,node);
            list.remove(list.size()-1);

        }

    }
}

class Node{
    int k;
    int v;
    public Node(int k, int v){this.k=k;this.v=v;}
}