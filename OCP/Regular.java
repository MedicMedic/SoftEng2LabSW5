package OCP;

public class Regular implements Discount
{
    @Override
    public double calculateDiscount(double amount) 
    {
        return amount * 0.00;
    }
    
    @Override
    public double applyDiscount(double amount) 
    {
        return amount - calculateDiscount(amount);
    } 
}
