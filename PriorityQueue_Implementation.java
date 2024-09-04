import java.util.Comparator;
import java.util.PriorityQueue;
class PriorityQueue_Implementation{
public static void main(String[] args) {
    

PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>(){
@Override
public int compare(String s1, String s2){ //this copare is an comparator method
    int num1 = Integer.parseInt(s1.split(":")[1].trim());
    int num2 = Integer.parseInt(s2.split(":")[1].trim());
    return Integer.compare(num2,num1);  //this compare is an integer fucntion
}
});

pq.add("Jim:10");
pq.add("Jonny:3");
pq.add("tuld:5");
pq.add("peter:9");
pq.add("john:7");

System.out.println("Now the first elemnt based on priority is: "+pq.peek());
System.out.println("Polling priority quese elements:\n");
while(!pq.isEmpty()){
    System.out.println(pq.poll());
}

//clearing the queue
pq.clear();
}
}