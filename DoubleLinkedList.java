



class DoubleLinkedList{
    Node head;

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void append(int data){
        Node newNode= new Node(data);
        if(head==null){
         head=newNode;
         return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.prev=current;
    }

    public void displayForward(){
        Node cur=head;
        
            System.out.print("Traversing the doublelinked list in Forward\n");
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
    }

    public void displayBackward(){
        Node cur=head;
        
        while(cur.next!=null){
            cur=cur.next;
        }
        
          System.out.print("\nTraversing the doublelinked list in Backwards\n");
        while(cur !=null){
          System.out.print(cur.data + "->");
        cur=cur.prev;
        }
    }

    public static void main(String args[]){
        DoubleLinkedList Dl=new DoubleLinkedList();
        Dl.append(67);
        Dl.append(45);
        Dl.append(88);
        Dl.displayForward();
        Dl.displayBackward();
    }



}