package ucl.cs;

import java.util.LinkedList;
import phoneNumNode;

public class RecentlyUsedList{
	LinkedList<phoneNumNode> numbers;
	phoneNumNode head;
	public RecentlyUsedList(){
		numbers = new LinkedList<phoneNumNode>();
	}
	public void add(phoneNumNode n){
		if(numbers == null){
			numbers.add(n);
			head = n; 
		}
		n.next = head;
		head = n;
	}
	public void remove(){
		
	}
}


