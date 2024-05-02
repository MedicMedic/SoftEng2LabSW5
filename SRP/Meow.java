package SRP;
public class Meow implements PetSoundStrategy
{
    private String petType;

    public Meow(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void makeSound(String petType)
    {
        System.out.println(petType + " meows!");
    }
}