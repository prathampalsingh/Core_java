package collectionFramework;

import java.util.*;

public class QueueExx {

		public static void main(String[] args) {
		    //    Queue<String> q=new ArrayDeque<String>(); 
		        Queue<String> q=new PriorityQueue<String>(); 
//		        q.offer("Tauhid"); 
//		        q.offer("Adnan");  
//		        q.offer("Viper");
//		        q.offer("Saima");
		        q.add("Dfl");
		        q.offer("sf");
		        q.offer("cf");
		        q.add("Res");
		        System.out.println("Queue : "+q);
		        System.out.println("head of Queue :"+ q.peek());
	    //q.remove();
		        System.out.println("Queue remove 1: "+q.remove());
		        System.out.println("Queue remove 2 : "+q.remove());
		        System.out.println("Queue remove 3 : "+q.poll ());
		        q.remove("sf");
	        System.out.println("Queue : "+q);  
		}
}
