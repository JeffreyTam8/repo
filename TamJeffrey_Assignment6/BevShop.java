
/**
 * This class creates the necessary list of methods needed for BevShop class
 */
import java.util.ArrayList;

public class BevShop implements BevShopInterfce{
	
	public int numOfAlcoholDrink;
	public final int MAX_ALCOHOL_DRINK = 3;
	public final int MIN_AGE = 21;
	public ArrayList<Beverage> listOfDrinks;
	public String time;
	public String day;
	public String customerName;
	
	/**
	 * This return the infomation of Shop in string form
	 */
	public String toString() {
		
		return "";
		
	}

	/**
	 * This returns if the time of the bevshop is open
	 */
	@Override
	public boolean validTime(int time) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This returns to see if more drinks are needed to be ordered
	 */
	@Override
	public boolean eligibleForMore() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean validAge(int age) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void startNewOrder(int time, BevShopInterfce.DAY day, String customerName, int customerAge) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void processCoffeeOrder(String bevName, BevShopInterfce.SIZE size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void processAlcoholOrder(String bevName, BevShopInterfce.SIZE size) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void processSmoothieOrder(String bevName, BevShopInterfce.SIZE size, int numOfFruits, boolean addProtien) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
