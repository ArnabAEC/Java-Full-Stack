package lltoarray;

import java.util.ArrayList;
import java.util.LinkedList;

public class llToArray {

public static void main(String[] args) {
	LinkedList <String> list = new LinkedList<String>();
    //Instantiating an ArrayList object
    list.add("JavaFX");
    list.add("Java");
    list.add("JavaScript");
    list.add("React");
    list.add("Angular");
  
    ArrayList<String> arrayList = new ArrayList<String>(list);

    
    
    System.out.println("Contents of the array: \n"+arrayList.toString());

}
}
