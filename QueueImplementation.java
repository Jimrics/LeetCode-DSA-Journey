import java.util.LinkedList;
import java.util.Queue;

class QueueImplementation{
    public static void main(String args[]){
    Queue<String> movie_line=new LinkedList<>();
    movie_line.add("Jim");
    movie_line.add("Jonny");
    movie_line.add("Jamie");
    System.out.println("Elemets in movie queue are"+movie_line);
    System.out.println("The first person in the queue to buy tickets is "+movie_line.peek());
    movie_line.remove();
    System.out.println("New first element after removing the previous first element "+movie_line.peek());
//Looping over the Queue to the 2nd element
int count=0;
for(String element :movie_line){
    if(count==2){
        System.out.println("The 2nd element is"+element);
    }
    count++;
}
    //Using type case to remove the last elemnt directly
    if(movie_line instanceof LinkedList){ //checking if its of the instance of linked list coz the removeLast method i s only available in LinkedList
        ((LinkedList<String>) movie_line).removeLast();// typec asiting the movie line from queue to linked list to access the remove last funticon
    }
    System.out.println("Th queue after removing the last elemnt"+movie_line);
    }
}