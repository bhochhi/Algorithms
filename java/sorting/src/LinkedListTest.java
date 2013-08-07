import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


public class LinkedListTest {
	private String str;
	private void display(){
		str = "Hello ";
		System.out.println(str);
	}
	 public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	       	LinkedListTest.class.newInstance().display();
	        System.out.println(Map.class.getName()); 
	        System.out.println(LinkedListTest[].class.getName());      
	        System.out.println(LinkedListTest.class.getPackage()); 
	        
	        LinkedList<String> list = new LinkedList<String>();
	        list.add("h");
	        list.add("323jds");
	        System.out.println(list.peekFirst());
        
	        Queue<String> queue = new LinkedList<String>();
	        queue.add("Rupesh");
	        queue.add("Sam");
	        queue.add("Hello");
	        System.out.println(queue.peek());
	        
	    }
	
}