import java.util.ArrayList;
import java.util.List;

public abstract class Appstore
{
    private String name;
    private Currency currency;
    protected List<App> apps;
    protected List<Purchase> purchases;

    public Appstore(String name, Currency currency)
    {
        this.name = name;
        this.currency = currency;
        this.apps = new ArrayList<>();
        this.purchases = new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Currency getCurrency()
    {
        return this.currency;
    }

    public void setCurrency(Currency currency)
    {
        this.currency = currency;
    }

    public List<App> getApps()
    {
        return this.apps;
    }

    public void setApps(List<App> apps)
    {
        this.apps = apps;
    }

    public List<Purchase> getPurchases()
    {
        return this.purchases;
    }

    public void setPurchases(List<Purchase> purchases)
    {
        this.purchases = purchases;
    }

    public void uploadApp(App app)
    {
        apps.add(app);
    }

    public void purchaseApp(App app, User user) throws DownloadNotAllowedException
    {
        int userAge = user.getAge();

        if (app.isHasViolence() && userAge < 16)
        {
            throw new DownloadNotAllowedException("Must be at least 16 years old to download apps with violence");
        }

        if (app.isHasNudity() && userAge < 18)
        {
            throw new DownloadNotAllowedException("Must be at least 18 years old to download apps with nudity");
        }

        purchases.add(new Purchase(user, app));
    }

    public double getRevenue(App app)
    {
        double AppstoreRevenue = 0.0;
        for (Purchase revenue : purchases)
        {
            if (revenue.getApp().equals(app))
            {
                AppstoreRevenue += revenue.getApp().getPrice() * 0.70;
            }
        }
        return AppstoreRevenue;
    }

    public double getTotalRevenue()
    {
        double totalAppStoreRevenue = 0.0;
        for (Purchase totalrevenue : purchases)
        {
            totalAppStoreRevenue += totalrevenue.getApp().getPrice() * 0.70;
        }
        return totalAppStoreRevenue;
    }
}

class AppleAppStore extends Appstore
{
    public AppleAppStore(String name, Currency currency)
    {
        super(name, currency);
    }

    @Override
    public void uploadApp(App app)
    {
        if (app.isHasNudity())
        {
            System.err.println("Apple App Store does not allow apps containing nudity");
            return;
        }
        super.uploadApp(app);
    }
}

class GooglePlayStore extends Appstore
{
    public GooglePlayStore(String name, Currency currency)
    {
        super(name, currency);
    }
}