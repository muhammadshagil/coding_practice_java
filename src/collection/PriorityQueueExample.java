import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("one");
		priorityQueue.add("two");
		priorityQueue.add("three");
		priorityQueue.add("four");
		priorityQueue.add("five");
		
		System.out.println("head element: "+priorityQueue.element()); //throws exception if queue is empty
		System.out.println("peak element/ head : "+priorityQueue.peek());
		
		
		priorityQueue.poll();
		priorityQueue.remove(); //throws exception if queue is empty
		
		priorityQueue.stream().forEach(System.out::println);

	}

}
