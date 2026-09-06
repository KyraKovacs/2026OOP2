import java.util.List;

public abstract class Character
{
    private int level;
    private int XP;

    public Character()
    {
        this.level = 1;
        this.XP = 0;
    }

    public int getLevel()
    {
        return this.level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getXP()
    {
        return this.XP;
    }

    public void setXP(int XP)
    {
        this.XP = XP;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void useSpecialAbility();

    public abstract List<Quest> getQuests();

    public void addXP(int amount)
    {
        XP += amount;
    }

    public void levelUp()
    {
        if (XP >= 200)
        {
            level++;
            XP -= 200;

            System.out.println("Leveled Up. Your new level: " + level);
        }
    }
}