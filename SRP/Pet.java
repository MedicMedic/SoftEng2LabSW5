package SRP;
public class Pet 
{
    private PetType pet;

    public Pet(PetType pet)
    {
        this.pet = pet;
    }

    public void makeSound()
    {
        pet.makeSound();
    }

    public void eat()
    {
        pet.eat();
    }
}
