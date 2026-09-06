public class SpecialQuest extends Quest
{
    private Item item;

    public SpecialQuest(String name, int experiencePoints, Character characterPlayedAgainst, int difficultyLevel, Item item)
    {
        super(name, experiencePoints, characterPlayedAgainst, difficultyLevel);

        this.item = item;
    }

    public Item getItem()
    {
        return this.item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    @Override
    public void complete(Character character)
    {
        if (enoughXP(character))
        {
            character.addXP(getExperiencePoints());

            System.out.println("Special quest '" + getName() + "' completed");

            System.out.println("Earned " + getExperiencePoints() + " XP");

            System.out.println("You received item: " + item.getTitle());

        }
        else {
            System.out.println("Not enough XP to play special quest '" + getName());

            System.out.println("Required XP: " + (getDifficultyLevel() * 10));
        }
    }
}