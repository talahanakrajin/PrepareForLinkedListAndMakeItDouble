public class SinglyLinkList{
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
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

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);

        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }    
    
}