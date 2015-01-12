
public class BagelsOrderItem implements OrderItem{

	private double price; 
	private int quantity;
	private double cost;
	
	public BagelsOrderItem(double aPrice, int aQuantity)
	{
		price=aPrice;
		quantity=aQuantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getCost()
	{
		cost = price*quantity;
	}
	
	
	
}
