public class Linked_List{
    Node head;
    class Node{
        String  data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public  void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;

    }
    
    public void printNode(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        while(currNode.next!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print(currNode.data);
    }

    public static void main(String[] args) {
        Linked_List list=new Linked_List();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("List");
        list.printNode();
    }  
}