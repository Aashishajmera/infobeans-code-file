package lltopic;

import java.util.LinkedList;

public class KthLargest {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-9);
        ll.add(88);
        ll.add(0);
        ll.add(22);
        ll.add(88);

        for (int i = 0; i < ll.size(); i++) {
            for (int j = 0; j < ll.size() - 1 - i; j++) {
                if(ll.get(j) < ll.get(j+1)){
                    ll.set(j) = ll.get(j);
                }
            }
        }
    }
}
