public class App
{
    private String name;
    private double price;
    private boolean hasViolence;
    private boolean hasNudity;

    public App(String name, double price, boolean hasViolence, boolean hasNudity)
    {
        this.name = name;
        this.price = price;
        this.hasViolence = hasViolence;
        this.hasNudity = hasNudity;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isHasViolence()
    {
        return this.hasViolence;
    }

    public void setHasViolence(boolean hasViolence)
    {
        this.hasViolence = hasViolence;
    }

    public boolean isHasNudity()
    {
        return this.hasNudity;
    }

    public void setHasNudity(boolean hasNudity)
    {
        this.hasNudity = hasNudity;
    }
}