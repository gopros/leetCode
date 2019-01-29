package code138;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public RandomListNode copyRandomList(RandomListNode head) {

        RandomListNode p = head, pre = null,headRandom=null,q=null;

        while (p!=null){
            if (pre==null){
                RandomListNode randomListNode = new RandomListNode(p.label);
                headRandom = randomListNode;
                pre = headRandom;
            }else {
                RandomListNode randomListNode = new RandomListNode(p.label);
                pre.next = randomListNode;
                pre = randomListNode;
            }
            p = p.next;

        }


        p = head;
        q = headRandom;

        while (p!=null&&q!=null){

            RandomListNode random = p.random;
            if (random==null){
                q.random = null;
            }else {
                RandomListNode n = head,m = headRandom;
                while (n!=null&&m!=null){
                    if (n==random){
                        q.random = m;
                        break;
                    }
                    n=n.next;
                    m=m.next;
                }

            }

            p = p.next;
            q = q.next;
        }

        return headRandom;

    }

    public RandomListNode copyRandomList2(RandomListNode head) {

        RandomListNode p = head, pre = null,headRandom=null,q=null;
        Map<RandomListNode,RandomListNode> randomListNodeMap = new HashMap<>();

        while (p!=null){
            if (pre==null){
                RandomListNode randomListNode = new RandomListNode(p.label);
                headRandom = randomListNode;
                pre = headRandom;
                randomListNodeMap.put(p,randomListNode);
            }else {
                RandomListNode randomListNode = new RandomListNode(p.label);
                pre.next = randomListNode;
                pre = randomListNode;
                randomListNodeMap.put(p,randomListNode);
            }
            p = p.next;

        }
        p = head;
        q = headRandom;
        while (p!=null&&q!=null){
            q.random = randomListNodeMap.get(p.random);
        }
        return headRandom;

    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
class RandomListNode {
    int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
 };