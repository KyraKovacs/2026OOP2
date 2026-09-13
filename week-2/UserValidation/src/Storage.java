import java.util.ArrayList;
import java.util.List;

public class Storage
{
    private List<User> users;

    public Storage(List<User> users)
    {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers()
    {
        return this.users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }

    public void save(User user)
    {
        users.add(user);
    }

    public boolean usernameExists(String username)
    {
        if (username == null) return false;

        for (User user : users)
        {
            if (username.equalsIgnoreCase(user.getName()))
            {
                return true;
            }
        }
        return false;
    }

    public User getUserByEmail(String email)
    {
        if (email == null) return null;

        for (User user : users)
        {
            if (email.equalsIgnoreCase(user.getEmail()))
            {
                return user;
            }
        }
        return null;
    }
}