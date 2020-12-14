import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTest extends Beverage{

	Coffee c1,c2,c3,c4;
	@Before
	public void setUp() throws Exception {
		c1 = new  Coffee ("c1Name", SIZE.SMALL, false,false );
		c2 = new  Coffee ("c2NAme", SIZE.MEDIUM, true,true );
		c3 = new  Coffee ("c3NAme", SIZE.LARGE, false, true );
		c4 = new  Coffee ("c4NAme", SIZE.SMALL, true, false );
		
	}

	@After
	public void tearDown() throws Exception {
		c1=c2=c3=c4=null;
	}
	
	@Test
	public void testGetBasePrice()
	{
		assertEquals(2.0,c1.getBasePrice(), .01);
		assertEquals(2.0,c2.getBasePrice(), .01);
		assertEquals(2,c3.getBasePrice(), .01);
		assertEquals(2,c4.getBasePrice(), .01);
	}

	@Test
	public void testCalPrice() {
		
		assertEquals(2,c1.calcPrice(), .01 );
		assertEquals(4,c2.calcPrice(), .01 );
		assertEquals(4.5,c3.calcPrice(), .01 );
		assertEquals(2.5,c4.calcPrice(), .01 );
		 
	}
	@Test
	public void testToString() {
		
		assertTrue(c1.toString().contains(c1.getBevName()));
		assertTrue(c1.toString().contains(String.valueOf(c1.calcPrice()) ));
		assertTrue(c1.toString().contains(c1.getSize().toString() ));
	 
	 
	}

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
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
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Beverage beverage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Beverage o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType(OrderInterface.TYPE type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(OrderInterface.SIZE size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderInterface.TYPE getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderInterface.SIZE getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrderDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beverage getBeverage(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOrderNumer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getExtraShot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getExtraSyrup() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getWeather() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getProtein() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumFruit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}