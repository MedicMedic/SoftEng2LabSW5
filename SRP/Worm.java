package SRP;
public class Worm implements PetNutritionStrategy
{
    private String petType;

    public Worm(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void eat(String petType)
    {
        System.out.println(petType + " eats worm!");
    }
}