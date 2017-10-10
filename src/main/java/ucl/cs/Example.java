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
	public RecentlyUsedList(){
		numbers = new LinkedList<phoneNumNode>();
	}
	
}