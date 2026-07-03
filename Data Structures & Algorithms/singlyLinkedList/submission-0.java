class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
    }

    public int get(int index) {
        Node currNode = head;
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                return currNode.val;
            }
            currNode = currNode.next;
            counter++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

     public boolean remove(int index) {
        if (head == null || index < 0) {
            return false;
        }
        
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }
        
        Node prev = null;
        Node curr = head;
        int counter = 0;
        
        while (curr != null && counter < index) {
            prev = curr;
            curr = curr.next;
            counter++;
        }
        
        if (curr == null) {
            return false; 
        }
        
        prev.next = curr.next;
        
        if (curr == tail) {
            tail = prev;
        }
        
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node node = head;
        while(node != null) {
            result.add(node.val);
            node = node.next;
        }

        return result;
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
