public class UsernameValidation implements Validator
{
    private Storage storage;

    public UsernameValidation(Storage storage)
    {
        this.storage = storage;
    }

    public Storage getStorage()
    {
        return this.storage;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    @Override
    public boolean validate(User user)
    {
        if (user.getName() == null)
        {
            return false;
        }

        return !storage.usernameExists(user.getName());
    }
}