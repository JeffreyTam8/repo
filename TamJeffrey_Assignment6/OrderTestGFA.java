/**
 * This class manages the order.
 * The class connects with the Beverage class, OrderInterface, and Comparable
 * @author Jeffrey Tam
 * 
 * The change in the test is the added implements, which allows the junit test to access the OrderInterface
 * CRN: 21599
 * 
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestGFA implements Comparable<Order>, OrderInterface{
	Order r1,r2,r3,r4;
	@Before
	public void setUp() throws Exception {
		r1 = new Order (8, DAY.MONDAY, new Customer ("Mary", 22));
		r2 = new Order (12, DAY.SATURDAY, new Customer ("John", 45));
		r3 = new Order (10, DAY.SUNDAY, new Customer ("Kate", 21));
	}

	@After
	public void tearDown() throws Exception {
		r1=r2=r3=null;
	}
	
	@Test 
	public void testGetBeverage( )
	{
		Coffee cf = new Coffee("regular Coffee", SIZE.SMALL, false,false);
		Alcohol al = new Alcohol ("Mohito", SIZE.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", SIZE.MEDIUM,1,false);
		Smoothie sm2 = new Smoothie("Detox", SIZE.LARGE,1,false);
		
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
		r1.addNewBeverage("Mohito", SIZE.SMALL); 
		r1.addNewBeverage("Detox", SIZE.MEDIUM,1,false); 
		assertTrue(r1.getBeverage(0).equals(cf) );
		assertTrue(r1.getBeverage(1).equals(al) );
		assertTrue(r1.getBeverage(2).equals(sm1) );
		assertFalse(r1.getBeverage(2).equals(sm2) );
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException   {
		
		assertTrue(r1.getTotalItems() == 0);
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
	 	assertTrue(r1.getBeverage(0).getType().equals(TYPE.COFFEE));
		r1.addNewBeverage("Mohito", SIZE.SMALL); 
		assertTrue(r1.getBeverage(1).getType().equals(TYPE.ALCOHOL));
		r1.addNewBeverage("Detox", SIZE.MEDIUM,1,false); 
		assertTrue(r1.getBeverage(2).getType().equals(TYPE.SMOOTHIE));
		assertTrue(r1.getTotalItems() == 3);
		
		r2.addNewBeverage("Detox", SIZE.MEDIUM,4,true); 
		assertTrue(r2.getBeverage(0).getType().equals(TYPE.SMOOTHIE));
		r2.addNewBeverage("Mohito", SIZE.SMALL); 
		assertTrue(r2.getBeverage(1).getType().equals(TYPE.ALCOHOL));
		r2.addNewBeverage("regular Coffee", SIZE.MEDIUM, true,false);
		assertTrue(r2.getBeverage(2).getType().equals(TYPE.COFFEE));
		assertTrue(r2.getTotalItems() == 3);
		 
	}
	 
	 
	@Test
	public void testCalcOrderTotal()   {
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
	 	r1.addNewBeverage("Mohito", SIZE.SMALL); 
		r1.addNewBeverage("Detox", SIZE.MEDIUM,1,false); 
	 
		assertEquals(7.5,r1.calcOrderTotal(),.01);
		
		r2.addNewBeverage("regular Coffee", SIZE.MEDIUM, true,false);
	 	r2.addNewBeverage("Mohito", SIZE.SMALL); 
		r2.addNewBeverage("Detox", SIZE.MEDIUM,4,true); 
		
		assertEquals(12.6,r2.calcOrderTotal(),.01);
		 
	}

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, int numOfFruits, boolean addPRotien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findNumOfBeveType(OrderInterface.TYPE type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return 0;
	}

}