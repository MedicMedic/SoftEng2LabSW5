package SRP;
public class Fish implements PetNutritionStrategy
{
    private String petType;

    public Fish(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void eat(String petType)
    {
        System.out.println(petType + " eats fish!");
    }
}