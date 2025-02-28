public class DoublyLinkList {
    static class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node("Tommy");
        Node second = new Node("Timmy");
        Node third = new Node("Daffa");
        Node fourth = new Node("Dicky");

        head.next = second;
        second.next = third;
        third.next = fourth;
        
        second.prev = head;
        third.prev = second;
        fourth.prev = third;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);

        System.out.println(head.next.next.next.prev.data);
        System.out.println(head.next.next.prev.data);
        System.out.println(head.next.prev.data);
        System.out.println(head.data);

    }
}
