public class Quest
{
    private String name;
    private int experiencePoints;
    private Character characterPlayedAgainst;
    private int difficultyLevel;

    public Quest(String name, int experiencePoints, Character characterPlayedAgainst, int difficultyLevel)
    {
        this.name = name;
        this.experiencePoints = experiencePoints;
        this.characterPlayedAgainst = characterPlayedAgainst;
        this.difficultyLevel = difficultyLevel;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getExperiencePoints()
    {
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints)
    {
        this.experiencePoints = experiencePoints;
    }

    public Character getCharacterPlayedAgainst()
    {
        return this.characterPlayedAgainst;
    }

    public void setCharacterPlayedAgainst(Character characterPlayedAgainst)
    {
        this.characterPlayedAgainst = characterPlayedAgainst;
    }

    public int getDifficultyLevel()
    {
        return this.difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel)
    {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean enoughXP(Character character)
    {
        int requiredXP = difficultyLevel * 10;

        return character.getXP() >= requiredXP;
    }

    public void complete(Character character)
    {
        if (enoughXP(character))
        {
            character.addXP(experiencePoints);

            System.out.println("Quest '" + name + "' completed");

            System.out.println("Earned " + experiencePoints + " XP");

        }
        else
        {
            System.out.println("Not enough XP to play quest '" + name);

            System.out.println("Required XP: " + (difficultyLevel * 10));
        }
    }
}