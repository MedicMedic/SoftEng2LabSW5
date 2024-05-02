package DIP;

public class PaymentProcessor {

    public void processPayment(Order order) {
      String paymentMethod = order.getPaymentMethod();
  
      if (paymentMethod.equals("ewallet")) {
        EWallet ewallet = new EWallet();
        ewallet.pay(order.getAmount());
        System.out.println ("You are paying in GCash")
      } else if (paymentMethod.equals("cash")) {
        System.out.println ("You are paying in Cash").
      } else if (paymentMethod.equals("creditcard")) {
        CreditCard creditCard = new CreditCard();
        creditCard.charge(order.getAmount());
        System.out.println ("You are paying using Credit Card")
      } else {
        throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
      }
  
    }
  }
  
