package SRP;
public class Quack implements PetSoundStrategy
{
    private String petType;

    public Quack(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void makeSound(String petType)
    {
        System.out.println(petType + " quacks!");
    }
}