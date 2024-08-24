

class CircularList{
    Node head;
 class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
        this.next=this;
        this.prev=this;
    }
 }

 public void append(int data){
Node newNode=new Node(data);
if(head==null){
    head=newNode;
}
else{
    Node last = head.prev; //finding the last element bewcaue the last elemt will point to the head 
    last.next=newNode; //now the new Node will become the last element
    newNode.prev = last;// this make sthe previou last elemet as the second last now
    newNode.next=head; //in a circular lis the last element must point ot the begingn(head)
    head.prev=newNode; // now making the head piont to the newly added node as the end
}
 }

 public void display(){
    Node current;
    current=head;
    while(current.next!=head){
        System.out.print(current.data+"->");
        current=current.next;
    }
    System.out.print(current.data);
 }

public static void main(String[] args) {
    System.out.println("Circular List using Java\n");
CircularList CL=new CircularList();
CL.append(10);
CL.append(20);
CL.append(30);
CL.append(40);
CL.display();
}

}