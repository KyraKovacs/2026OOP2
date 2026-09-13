public class EmailValidation implements Validator
{
    @Override
    public boolean validate(User user)
    {
        String email = user.getEmail();

        return email != null && email.contains("@") && email.contains(".");
    }
}