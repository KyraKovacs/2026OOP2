import java.util.ArrayList;
import java.util.List;

public class UserValidationModule
{
    private List<Validator> validators = new ArrayList<>();
    private Storage storage;

    public UserValidationModule(List<Validator> validators, Storage storage)
    {
        this.validators = validators;
        this.storage = storage;
    }

    public List<Validator> getValidators()
    {
        return this.validators;
    }

    public void setValidators(List<Validator> validators)
    {
        this.validators = validators;
    }

    public Storage getStorage()
    {
        return this.storage;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    public void addValidator(Validator validator)
    {
        validators.add(validator);
    }

    public boolean validate(User user)
    {
        for (Validator validator : validators)
        {
            if (!validator.validate(user))
            {
                return false;
            }
        }
        return true;
    }

    public void saveValidatedUser(User user)
    {
        if (validate(user))
        {
            storage.save(user);
        }
        else
        {
            throw new IllegalArgumentException("User failed validation and cannot be saved.");
        }
    }
}