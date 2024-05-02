package SRP;
public class Duck implements PetType
{
    @Override
    public void makeSound()
    {
        Quack quack = new Quack("Duck");
        quack.makeSound("Duck");
    }

    public void eat()
    {
        Worm worm = new Worm("Duck");
        worm.eat("Duck");
    }
}