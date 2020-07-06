package july2020;

public class QueueMainClass {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		
	}

}
