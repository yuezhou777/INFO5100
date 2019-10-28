package Q5;

public class MyHashMap {

    private HashNode[] hashNodes;
    private int capacity;
    private int size;

    public MyHashMap() {
        this.capacity = 10000;
        hashNodes = new HashNode[capacity];
    }

    // define a "hash" method
    private int hash(int key) {
        if(key > 10000){
            return key % capacity;
        }else{
            return key;
        }
    }

    public void put(int key, int value) {
        HashNode node = new HashNode(key, value);
        int index = hash(key);
        // consider if the (key, value) pair already exists in the HashMap
        HashNode cur = hashNodes[index];
        HashNode pre = null;
        if (cur == null) {
            hashNodes[index] = node;
        } else {
            while (cur != null) {
                // if the key already exist, update the value
                if (cur.key == key) {
                    cur.value = value;
                    return;
                }
                pre = pre.next;
                cur = cur.next;
            }
            // if the keys are different, add the (key, value) pair node after the existing one
            pre.next = node;
        }
        size ++;
        return;
    }

    public int get(int key) {
        // like the put method, first - use "hash" method to calculate the index
        // second - consider if the key already exist
        // third - if the key exist, consider multiple (key, value) pairs
        int index = hash(key);
        HashNode cur = hashNodes[index];
        while(cur != null) {
            if(cur.key == key) {
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }

    public int remove(int key) {
        int index = hash(key);
        HashNode cur = hashNodes[index];
        HashNode pre = null;
        while(cur != null) {
            if(cur.key == key) break;
            pre = cur;
            cur = cur.next;
        }

        if(cur == null) {
            return -1;
        }else if(pre == null) {
            hashNodes[index] = cur.next;
        }else {
            pre.next = cur.next;
        }
        size --;
        return cur.value;
    }
}
