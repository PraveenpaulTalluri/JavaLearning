package practicequestionpart2;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

class SortByCreationDate implements Comparator<ProductDto>
{
	public int compare(ProductDto o1,ProductDto o2)
	{
		return o2.getProductCreationDate().compareTo(o1.getProductCreationDate());
	}
}
public class TestProductDto {
	
	List<ProductDto> list1=new ArrayList<>();
	List<ProductDto> list2=new ArrayList<>();
	
	
	void inputList1() throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer productKey:");
		int key=sc.nextInt();
		
		System.out.println("Enter Prodcution Description:");
		String desc=sc.next();
		
		System.out.println("Enter product creation date(dd/mm/yyyy):");
		String date=sc.next();
		Date pDate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		list1.add(new ProductDto(key,desc,pDate));
		
		menu();
		sc.close();
	}
	
	void inputList2() throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer productKey:");
		int key=sc.nextInt();
		
		System.out.println("Enter Prodcution Description:");
		String desc=sc.next();
		
		System.out.println("Enter product creation date(dd/mm/yyyy):");
		String date=sc.next();
		Date pDate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		list2.add(new ProductDto(key,desc,pDate));
		
		menu();
		sc.close();
	}
	
	void sortByCreationDate() throws InputMismatchException, ParseException
	{
		list1.sort(new SortByCreationDate());
		System.out.println("List-1");
		list1.forEach(products->System.out.println(products));
		
		list2.sort(new SortByCreationDate());
		System.out.println("List-2: ");
		list2.forEach(products->System.out.println(products));
		
		menu();
	}
	void findCommonProduct(List<ProductDto> list1,List<ProductDto> list2) throws InputMismatchException, ParseException
	{
	
		if(list1.isEmpty())
		{
			System.out.println("List-1 is empty, Please enter products into list-1");
			menu();
		}
		else if(list2.isEmpty())
		{
			System.out.println("List-2 is empty, Please enter products into list-2");
			menu();
		}
		else
		{
			list1.retainAll(list2);
			list1.forEach(commonProducts->System.out.println("product("+commonProducts+")"));
		}
	}
	void menu() throws ParseException,InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("     Select an option");
		System.out.println("Press 1: To enter product details into list-1");
		System.out.println("Press 2: To enter product details into list-2");
		System.out.println("Press 3: To sort Products by creation date");
		System.out.println("Press 4: To find common products");
		System.out.println("Enter any other integer to exit menu");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:inputList1();
				break;
		case 2:inputList2();
				break;
		case 3:sortByCreationDate();
				break;
		case 4:findCommonProduct(list1, list2);
				break;
		default: System.out.println("Exited");
		}
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		TestProductDto test=new TestProductDto();
		
		try {
			test.menu();
		}
		catch (InputMismatchException | ParseException e) {
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}
}
