import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
public class collectiondemo3 {

	public static void main(String[] args) {
	//TreeSet ts=new TreeSet();
	//ts.add("Anu");
	//ts.add("Sai");
	//ts.add("Neha");
	//ts.add("Amit");
	//ts.add("Anshu");
	//ts.add("Aman");
	//ts.add("Rajan");
	
	//System.out.println(ts);
	
	//ts.stream().forEach(t -> System.out.println(t) );
		
	TreeSet<Employee> tsemp=new TreeSet<Employee>();
	tsemp.add(new Employee(1,"anu","intern",24));
	tsemp.add(new Employee(2,"sham","intern",22));
	tsemp.add(new Employee(3,"neha","intern",23));
	tsemp.add(new Employee(4,"raj","intern",21));
	tsemp.add(new Employee(5,"anshu","intern",20));
		
	tsemp.stream().forEach((t) -> System.out.println(t));
		
	System.out.println("=================");
	//TreeSet<Employee> tsempByName =new TreeSet<Employee>(new Comparator<Employee>() {
	
	TreeSet<Employee> tsempByName =new TreeSet<Employee>(
			(Employee o1, Employee o2)->o2.getEmployeename().compareTo(o1.getEmployeename())
			);
	tsempByName.add(new Employee(1,"anu","intern",24));
	tsempByName.add(new Employee(2,"sham","intern",22));
	tsempByName.add(new Employee(3,"neha","intern",23));
	tsempByName.add(new Employee(4,"raj","intern",21));
	tsempByName.add(new Employee(5,"anshu","intern",20));
	
	
	tsemp.stream().forEach((t) -> System.out.println(t));
	
	
List<String> names = Arrays.asList("anu","neha","sham","sai","raj","aadi");
	System.out.println("==========Name start with letter a");
	
	names.stream().filter(t ->t.startsWith("a"))
	.forEach(t-> System.out.println(t));
	
	
	System.out.println("======Suare of numbers===");
	
	
	List<Integer> num =Arrays.asList(2,3,4,6,5,6,7,8,9,5);
	
	num.stream().map(x->x*x)
	.forEach(t-> System.out.println(t));
	
	num.stream()
	.distinct().map(x->x*x).forEach(x-> System.out.println(x));
	
	
	num.stream()
	.map(x->x*x).distinct().forEach(x-> System.out.println(x));
	
	
	System.out.println("====unique even elements=====");
	num.stream()
	.distinct().filter(t-> t%2==0).forEach(x-> System.out.println(x));
			
			
	System.out.println("List of employees age=22");
	tsemp.stream()
	.filter(e->e.getEmployeeage()==22)
	.map(Employee::getEmployeename)
	.forEach(x-> System.out.println(x));
	
	
	
	Optional<Employee> minage = tsempByName.stream()
	.min(Comparator.comparingInt(Employee::getEmployeeage));
	
	Employee emp=    minage.get();
	System.out.println(emp);
	
	}

}
