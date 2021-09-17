import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex {
	public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Pizza");
	list.add("Tacos");
	list.add("Nachos");
	list.add("Burger");
	list.add("Wrap");
	
	Iterator<String> itr = list.iterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
	
	 