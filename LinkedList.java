class LinkedList{
Node head;

     class Node{
        int data;
        Node next;

        public Node(int data){
        this.data=data;
        this.next=null;
    }
     }

public void append(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        return;
    }
    Node current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newNode;
}

public void display(){
    Node cur=head;   
    while(cur!=null){
        System.out.print("->"+cur.data);
        cur=cur.next;
    }
}

public static void main(String[] args) {
    LinkedList Slist=new LinkedList();
    Slist.append(10);
    Slist.append(20);
    Slist.append(80);
    Slist.display();
}
}
