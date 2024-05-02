package SRP;
public class PetPark 
{
    public static void main(String[] args) 
    {
        Pet dog = new Pet(new Dog());
        Pet cat = new Pet(new Cat());
        Pet duck = new Pet(new Duck());
    
        duck.eat();
        cat.makeSound();
    }
}
