import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeename().compareTo(o2.getEmployeename());
	}
	
}


public class CollectionDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> lstemp=new ArrayList<Employee>();
		lstemp.add(new Employee(1,"anu","intern",24));
		lstemp.add(new Employee(2,"sham","intern",22));
		lstemp.add(new Employee(3,"neha","intern",23));
		lstemp.add(new Employee(4,"raj","intern",21));
		lstemp.add(new Employee(5,"anshu","intern",20));
		
		lstemp.stream().forEach((Employee) -> System.out.println(Employee));
		
		Collections.sort(lstemp, new SortByName());
		System.out.println("sort by name");
		
		lstemp.stream().forEach((emp) -> System.out.println(emp));
		

	}

}
