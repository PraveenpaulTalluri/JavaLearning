package secondweekjavapractise;
import java.time.*;
import java.util.*;
import java.util.Comparator;


class JoiningDateSorter implements Comparator<Employee> 
{
   
    public int compare(Employee o1, Employee o2) {
        return o2.getDateOfJoining().compareTo(o1.getDateOfJoining());
    }
}

class NameSorter implements Comparator<Employee> 
{
   
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
class IdSorter implements Comparator<Employee> 
{
   
    public int compare(Employee o1, Employee o2) {
        return o2.getId().compareTo(o1.getId());
    }
}
public class ArrayListExample2 
{
	 public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<Employee> employees = new ArrayList<>();
	         
	        employees.add(new Employee(1l, "Alvis", LocalDate.of(2019, Month.APRIL, 21)));
	        employees.add(new Employee(4l, "Libin", LocalDate.of(2010, Month.APRIL, 22)));
	        employees.add(new Employee(3l, "Praveen", LocalDate.of(2021, Month.APRIL, 25)));
	        employees.add(new Employee(5l, "Vaishnavi", LocalDate.of(2019, Month.APRIL, 23)));
	        employees.add(new Employee(2l, "Paul", LocalDate.of(2018, Month.APRIL, 24)));
	                
	        System.out.println("*************Sorted Employees by Name************* ");
	        employees.sort(new NameSorter());
	        for(Employee e:employees) {System.out.println(e);}
	        
	        System.out.println("*************Sorted Employees by date of joining************* ");
	        employees.sort(new JoiningDateSorter());
	        for(Employee e:employees) {System.out.println(e);}
	        
	        System.out.println("*************Sorted Employees by Id************* ");
	        employees.sort(new IdSorter());
	        for(Employee e:employees) {System.out.println(e);}
	    }   

}
