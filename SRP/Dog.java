package SRP;
public class Dog implements PetType
{
    @Override
    public void makeSound()
    {
        Bark bark = new Bark("Dog");
        bark.makeSound("Dog");
    }

    public void eat()
    {
        Steak steak = new Steak("Dog");
        steak.eat("Dog");
    }
}