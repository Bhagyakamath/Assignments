
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakeOrder {

	public static void main(String[] args) {
		List<Customer> cstList=new ArrayList<Customer>();
		cstList.add(new Customer(1, "Rahul", "Smartphone", 15000, "Chennai", 2025, "Jan", 5));
		cstList.add(new Customer(2, "Kavya", "Pen", 20, "Bangalore", 2022, "Feb", 10));
		cstList.add(new Customer(3, "Nayana", "Book", 50, "Delhi", 2017, "March", 10));
		cstList.add(new Customer(4, "John", "Watch", 2500, "Hyderabad", 2017, "April", 6));
		cstList.add(new Customer(5, "Alice", "Mouse", 1500, "Pune", 2010, "March", 3));
		cstList.add(new Customer(6, "Bob", "Pen", 250, "Goa", 2022, "June", 7));
		cstList.add(new Customer(7, "David", "T-Shirt", 500, "Mysore", 2016, "Feb", 9));
		cstList.add(new Customer(8, "Radha", "Bag", 1780, "Mangalore", 2013, "August", 10));
		cstList.add(new Customer(9, "Prajwal", "Eraser", 10, "Kerala", 2022, "Feb", 7));
		cstList.add(new Customer(10, "Krithi", "Earphone", 680, "Kashmir", 2024, "Oct", 8));
		
		TakeOrder.getHighOrder(cstList);
		TakeOrder.getCatWiseOrder(cstList);
		TakeOrder.getMaxPrice(cstList);
		TakeOrder.getAvgMonthlySpending(cstList);
		TakeOrder.getMinOrderPrice(cstList);
		TakeOrder.getFirstOrder(cstList);

	}
	//Find highest orders in the year
	public static void getHighOrder(List<Customer> cstList) {
		Map<Integer, Customer> highOrder=cstList.stream().collect(Collectors.toMap(Customer :: getYoo, customer->customer, (c1,c2)->c1.getQty()>c2.getQty()? c1:c2));
		highOrder.forEach((year, customer)->System.out.println("Year:"+year+" Category:"+customer.getCategory()+" Quantity: "+customer.getQty()));
		System.out.println();
		
	}
	
	//Find out category wise orders
	public static void getCatWiseOrder(List<Customer> cstList) {
		Map<String, Integer> catOrd=cstList.stream().collect(Collectors.groupingBy(Customer :: getCategory, Collectors.summingInt(Customer :: getQty)));
		catOrd.forEach((cat, tq)->System.out.println("Category:"+cat+" Total Orders:"+tq));
		System.out.println();
	}
	
	//Print max price
	public static void getMaxPrice(List<Customer> cstList) {
		Optional<Customer> maxP=cstList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Customer :: getPrice)));
		maxP.ifPresent(c->System.out.println("Category:"+c.getCategory()+"\nPrice:"+c.getPrice()));
		System.out.println();
	}
	
	// Find average monthly spending
	public static void getAvgMonthlySpending(List<Customer> cstList) {
	    Map<String, Double> avgMonthlySpending = cstList.stream().collect(Collectors.groupingBy(Customer::getMoo, Collectors.averagingInt(Customer::getPrice)));
	    avgMonthlySpending.forEach((month, avgPrice) -> System.out.println("Month: " + month + ", Average Spending: " + avgPrice));
	    System.out.println();
	}
	
	// Find the minimum order price
	public static void getMinOrderPrice(List<Customer> cstList) {
	    Optional<Customer> minP = cstList.stream().collect(Collectors.minBy(Comparator.comparingInt(Customer::getPrice)));
        minP.ifPresent(c -> System.out.println("Category: " + c.getCategory() + "\nPrice: " + c.getPrice()));
        System.out.println();
	}
	
	// Find the first order 
	public static void getFirstOrder(List<Customer> cstList) {
	    Optional<Customer> firstOrder = cstList.stream().min(Comparator.comparingInt(Customer::getYoo)); 
	    firstOrder.ifPresent(c -> System.out.println("Name: " + c.getCtsName() + "\nCategory: " + c.getCategory() + "\nYear: " + c.getYoo()));
	    System.out.println();
	}

}
class Customer{
	private int id;
	private String ctsName;
	private String category;
	private int price;
	private String city;
	private int yoo;
	private String moo;
	private int qty;
	public Customer(){
		
	}
	public Customer(int id, String ctsName, String category, int price, String city, int yoo, String moo, int qty) {
		super();
		this.id = id;
		this.ctsName = ctsName;
		this.category = category;
		this.price = price;
		this.city = city;
		this.yoo = yoo;
		this.moo=moo;
		this.qty=qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCtsName() {
		return ctsName;
	}
	public void setCtsName(String ctsName) {
		this.ctsName = ctsName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getYoo() {
		return yoo;
	}
	public void setYoo(int yoo) {
		this.yoo = yoo;
	}
	public String getMoo() {
		return moo;
	}
	public void setMoo(String moo) {
		this.moo = moo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}