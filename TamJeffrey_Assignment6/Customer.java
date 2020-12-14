
public class Customer {
	
	public String name;
	public int age;
	
	public Customer(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public Customer(Customer customer) {
		
		name = customer.name;
		age = customer.age;
		
	}
	
	public String toString() {
		
		return  "";
	}
	
	
	public void setName(String name) {

		this.name = name;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	
	
}
