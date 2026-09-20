public class Purchase
{
    private User user;
    private App app;

    public Purchase(User user, App app)
    {
        this.user = user;
        this.app = app;
    }

    public User getUser()
    {
        return this.user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public App getApp()
    {
        return this.app;
    }

    public void setApp(App app)
    {
        this.app = app;
    }
}