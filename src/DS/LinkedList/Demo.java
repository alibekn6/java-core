package DS.LinkedList;



public class Demo {
    public static void main(String[] args) {

        // usage of written LLNode class

        LLNode l = new LLNode(11);
        l.insert(12, l);
        l.insert(96, l);
        l.insertToBegin(33,l);
        l.insertToBegin(14,l);
        l.display(l);
    }
}

class LLNode {
    int data;
    LLNode next;

    LLNode (int data) {
        this.data = data;
        this.next = null;
    }
    // insert to end function
    LLNode insert(int key, LLNode head) {
        LLNode temp = new LLNode(key);
        LLNode ttmp1 = head;
        if (temp == null) {
            head = temp;
        } else {
            while (ttmp1.next != null) {
                ttmp1 = ttmp1.next;
            }
            ttmp1.next = temp;
        }
        return head;
    }
    // should insert to begin (doesnt work properly);
    LLNode insertToBegin(int key, LLNode head) {
        LLNode temp = new LLNode(key);
        temp.next = head;
        head = temp;
        return head;
    }
    //to get length;
    int length (LLNode head) {
        int c = 0;
        LLNode ttmp=head;
        if (ttmp == null) {
            return 0;
        } else {
            while (ttmp != null) {
                ttmp = ttmp.next;
                c++;
            }
        }
        return c;
    }


    void display (LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}


