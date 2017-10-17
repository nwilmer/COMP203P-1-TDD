package ucl.cs;
import java.util.*;

public class Example {

  public int answer() {
    return 42;
  }

}
public class phoneNumNode{
	phoneNum next;
	String phoneNum;
	public phoneNumNode(){
		phoneNum = "";
	}
	public phoneNumNode(String num){
		phoneNum = num;
	}
}
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
	
}