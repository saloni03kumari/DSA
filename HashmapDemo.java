public class HashmapDemo {
    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(17, 300); // collision example

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(17));
        System.out.println(map.get(5));
    }
}

class MyHashMap {

    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int SIZE = 16;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public Integer get(int key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }
}

