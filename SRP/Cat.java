package SRP;
public class Cat implements PetType
{
    @Override
    public void makeSound()
    {
        Meow meow = new Meow("Cat");
        meow.makeSound("Cat");
    }

    public void eat()
    {
        Fish fish = new Fish("Cat");
        fish.eat("Cat");
    }
}