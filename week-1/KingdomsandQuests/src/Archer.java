import java.util.List;

public class Archer extends Character
{
    private String attribute;
    private Ability specialAbility;
    private int attackPower;
    private int defensePower;
    private boolean specialActive;

    public Archer(String attribute)
    {
        super();

        this.attribute = attribute;
        this.specialAbility = new Ability("Double damage");
        this.attackPower = 40;
        this.defensePower = 40;
        this.specialActive = false;
    }

    public String getAttribute()
    {
        return this.attribute;
    }

    public void setAttribute(String attribute)
    {
        this.attribute = attribute;
    }

    public Ability getSpecialAbility()
    {
        return this.specialAbility;
    }

    public void setSpecialAbility(Ability specialAbility)
    {
        this.specialAbility = specialAbility;
    }

    public int getAttackPower()
    {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower)
    {
        this.attackPower = attackPower;
    }

    public int getDefensePower()
    {
        return this.defensePower;
    }

    public void setDefensePower(int defensePower)
    {
        this.defensePower = defensePower;
    }

    public boolean isSpecialActive()
    {
        return this.specialActive;
    }

    public void setSpecialActive(boolean specialActive)
    {
        this.specialActive = specialActive;
    }

    @Override
    public void attack()
    {
        int damage = attackPower;

        if (specialActive)
        {
            damage *= 2;
            specialActive = false;
        }

        System.out.println("Archer attacks and deals " + damage + " damage!");
    }

    @Override
    public void defend()
    {
        System.out.println("Archer defends with " + defensePower + " defense.");
    }

    @Override
    public void useSpecialAbility()
    {
        specialActive = true;

        System.out.println("Archer uses " + specialAbility.getName());
    }

    @Override
    public List<Quest> getQuests()
    {
        return List.of();
    }
}