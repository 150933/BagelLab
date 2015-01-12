
public class BakersDozen extends BagelsOrderItem{

	public BakersDozen(double price)
	{
		super (price, 13);     //invokes the constructor of the super class "BagelsOrderItem"
	}
	
	public double getCost()   //re-defining the method "getCost" in order to over-ride it 
	{
		return super.getPrice()*12;
	}
	
	
}
