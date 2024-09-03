import java.util.Stack;

class StackImplementation{
    public static void main(String args[]){
        Stack<Integer> container=new Stack<>();
        container.push(1);
        container.push(2);
        container.push(3);
        container.push(4);
        container.push(5);

        System.out.println("Printing every element in the stack\n");
// method 1
        for(int i=0;i<container.size();i++){
            System.out.println(container.get(i));
        }

        //method 2
        for(Integer element: container){
            System.out.println(element);
        }

        //Stack operations
        System.out.println("Stack operations\n");
        //pop
        System.out.println("Pop: "+container.pop());
        //peek
        System.out.println("Peek: "+container.peek());
        //isEmpty
        System.out.println("isEmplty "+container.isEmpty());
        //elementAt
        System.out.println("elementAt: "+container.elementAt(2));
        //search
        System.out.println("Search "+container.search(4));
        //size
        System.out.println("Size: "+container.size());
    }
}