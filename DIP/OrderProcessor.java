package DIP;

public class OrderProcessor 
{
    private PaymentProcessor paymentProcessor;

    public OrderProcessor(PaymentProcessor paymentProcessor)
    {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order)
    {
        
    }
}
