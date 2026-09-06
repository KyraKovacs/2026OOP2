import java.util.List;

public class Mage extends Character
{
    private String attribute;
    private Ability specialAbility;
    private int attackPower;
    private int defensePower;
    private boolean specialActive;

    public Mage(String attribute)
    {
        super();
        this.attribute = attribute;
        this.specialAbility = new Ability("Increase defense");
        this.attackPower = 30;
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
        System.out.println("Mage attacks with " + attackPower + "power.");
    }

    @Override
    public void defend()
    {
        int defense = defensePower;

        if (specialActive)
        {
            defense += 20;
            specialActive = false;

            System.out.println("Increased Attack Power");
        }

        System.out.println("Mage defends with " + defense + " defense.");
    }

    @Override
    public void useSpecialAbility()
    {
        specialActive = true;

        System.out.println("Mage uses " + specialAbility.getName());
    }

    @Override
    public List<Quest> getQuests()
    {
        return List.of();
    }
}