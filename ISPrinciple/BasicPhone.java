package ISPrinciple;

public class BasicPhone implements CallFeature, SMSFeature
{
    @Override
    public void makeCall(String number)
    {
        System.out.println("Dialing " + number);
    }

    @Override
    public void sendSMS(String number, String message)
    {
        System.out.println("Sending " + message + " to " + number + ".");
    }
}
