package SRP;
public class Steak implements PetNutritionStrategy
{
    private String petType;

    public Steak(String petType)
    {
        this.petType = petType;
    }

    @Override
    public void eat(String petType)
    {
        System.out.println(petType + " eats steak!");
    }
}