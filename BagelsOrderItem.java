
public class BagelsOrderItem implements OrderItem{

	private double price; 			//three fields are price, quantity, and cost. Made the private because they aren't essential for other classes
	private int quantity;
	private double cost;
	
	public BagelsOrderItem(double aPrice, int aQuantity) //constructor that sets the price and quantity 
	{
		price=aPrice;
		quantity=aQuantity;
	}
	
	public double getPrice()			//getPrice method retrieves the price value 
	{
		return price;
	}
	
	public int getQuantity()	//getQuantity method retrieves the quantity value 
	{
		return quantity;
	}
	
	public double getCost()		//getCost method retrieves the cost value 
	{
		cost = price*quantity;
	}
	
	
	
}
