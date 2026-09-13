import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements Validator
{
    private int minimumAge;

    public AgeValidation(int minimumAge)
    {
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge()
    {
        return this.minimumAge;
    }

    public void setMinimumAge(int minimumAge)
    {
        this.minimumAge = minimumAge;
    }

    @Override
    public boolean validate(User user)
    {
        if (user.getDateOfBirth() == null)
        {
            return false;
        }

        int age = Period.between(user.getDateOfBirth(), LocalDate.now()).getYears();

        return age >= minimumAge;
    }
}