package ISPrinciple;

public class Samsung implements CallFeature, Camera, SMSFeature, WebBrowser
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

    @Override
    public void browseWeb(String url)
    {
        System.out.println("Loading " + url + "...");
    }

    @Override
    public void takePicture()
    {
        System.out.println("SNAP!");
    }
}
