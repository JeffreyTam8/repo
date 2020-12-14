import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTest extends Beverage{
	Alcohol a1 , a2 ,a3,a4;

	@Before
	public void setUp() throws Exception {
		a1 = new  Alcohol ("A1Name", SIZE.SMALL, false );
		a2 = new  Alcohol ("A2NAme", SIZE.MEDIUM, true );
		a3 = new  Alcohol ("A3NAme", SIZE.LARGE, false );
		a4 = new  Alcohol ("A4NAme", SIZE.SMALL, true );
		
	}

	@After
	public void tearDown() throws Exception {
		a1=a2=a3=a4=null;
	}
	
	@Test
	public void testGetBasePrice()
	{
		assertEquals(2.0,a1.getBasePrice(), .01);
		assertEquals(2.0,a2.getBasePrice(), .01);
		assertEquals(2.0,a3.getBasePrice(), .01);
		assertEquals(2.0,a4.getBasePrice(), .01);
	}
 
	@Test
	public void testCalPrice() {
		
		assertEquals(2,a1.calcPrice(), .01 );
		assertEquals(3.6,a2.calcPrice(), .01 );
		assertEquals(4,a3.calcPrice(), .01 );
		assertEquals(2.6,a4.calcPrice(), .01 );
	}
	@Test
	public void testToString() {
		
		assertTrue(a1.toString().contains(a1.getBevName()));
		assertTrue(a1.toString().contains(String.valueOf(a1.calcPrice()) ));
		assertTrue(a1.toString().contains(a1.getSize().toString() ));
	 
	 
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