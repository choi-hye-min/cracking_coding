package problem.capter02_linkedlist;

/**
 * 단방향 연결리스트
 */
public class SimpleLinkedList {
    private SimpleLinkedList next = null;
    private int data;

    public SimpleLinkedList(int d) {
        this.data = d;
    }

    SimpleLinkedList appendToTail(int d){
        SimpleLinkedList end = new SimpleLinkedList(d);
        SimpleLinkedList n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;

        return n.next;
    }

    public SimpleLinkedList getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(SimpleLinkedList next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
