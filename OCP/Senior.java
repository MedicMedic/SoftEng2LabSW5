package OCP;

public class Senior implements Discount
{
    @Override
    public double calculateDiscount(double amount) 
    {
        return amount * 0.10;
    }
    
    @Override
    public double applyDiscount(double amount) 
    {
        return amount - calculateDiscount(amount);
    } 
}
