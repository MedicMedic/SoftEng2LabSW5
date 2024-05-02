package OCP;

public class Student implements Discount
{
    @Override
    public double calculateDiscount(double amount) 
    {
        return amount * 0.05;
    }
    
    @Override
    public double applyDiscount(double amount) 
    {
        return amount - calculateDiscount(amount);
    }  
}
