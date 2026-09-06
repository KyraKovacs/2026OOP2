import java.util.List;

public class Warrior extends Character
{
    private String attribute;
    private Ability specialAbility;
    private int attackPower;
    private int defensePower;
    private boolean specialActive;

    public Warrior(String attribute)
    {
        super();

        this.attribute = attribute;
        this.specialAbility = new Ability("Increase damage");
        this.attackPower = 50;
        this.defensePower = 30;
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
            damage += 20;
            specialActive = false;

            System.out.println("Increased Attack Power");
        }

        System.out.println("Warrior attacks with " + attackPower + "power.");
    }

    @Override
    public void defend()
    {
        System.out.println("Warrior defends with " + defensePower + " defense.");
    }

    @Override
    public void useSpecialAbility()
    {
        specialActive = true;

        System.out.println("Warrior uses " + specialAbility.getName());
    }

    @Override
    public List<Quest> getQuests()
    {
        return List.of();
    }
}