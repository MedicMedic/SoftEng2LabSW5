package SRP;

public class Bark implements PetSoundStrategy
{
    private String petType;

    public Bark(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void makeSound(String petType)
    {
        System.out.println(petType + " barks!");
    }
}