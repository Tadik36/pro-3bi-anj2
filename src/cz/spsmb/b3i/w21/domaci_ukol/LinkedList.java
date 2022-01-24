package cz.spsmb.b3i.w21.domaci_ukol;

class SeznamException extends Exception{
    public SeznamException(String message) {
        super("seznam prázdný");
    }
}
public class LinkedList {
    private Node head;

    public Node getHead() {
        return this.head;
    }

    void printList() {
        Node n = this.head;
        int i = 0;
        while (n != null) {
            System.out.print(((i%10==0)?"\n":" ") + n.toString());
            n = n.next;
            i++;
        }
    }
    public void append(Object data){
        //spojový seznam je prázdný, v hlavičce je null
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        //pokud není prázdný, najdu konec a přidám nový Node

        Node curr = this.head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data);
        curr.next = newNode;
    }
    public Object vyjmiPrvniho(){
        Node tmp = this.head;
        this.head = this.head.next;
        return tmp;

    }
}
