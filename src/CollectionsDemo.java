import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList lst=new ArrayList();
		//LinkedList lst=new LinkedList();
		lst.add(10);
		lst.add("Anu");
		lst.add("sai");
		lst.add(20);
		lst.add("Mradha");
		lst.add(true);
		lst.add("mn");
		lst.add(12.3f);
		lst.add("Radha");
		lst.add("krishna");
		lst.add(true);
		lst.add(1,4.3);
		Collections.sort(lst);
		
		
		//System.out.println("contains  " +lst.contains("Radha"));
		//System.out.println("Index of  " +lst.indexOf("Radha"));

		//Iterator itr=lst.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		lst.stream().forEach((t) -> System.out.println(t));	
		//lst.forEach(t -> System.out.println(t));
		
		
	}

}
