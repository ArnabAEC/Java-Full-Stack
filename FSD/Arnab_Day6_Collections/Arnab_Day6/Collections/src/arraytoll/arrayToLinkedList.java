package arraytoll;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayToLinkedList {

	public static void main(String[] args) {
  
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mark");
        list.add("Carl");
        list.add("John");
        LinkedList<String> linkedList
            = new LinkedList<String>(list);
  
        System.out.println("LinkedList of above array : "
                           + linkedList);
	}
}
