public class EmailValidator
{
    public static String validate(String email)
    {
        if (email != null && email.contains("@") && email.contains("."))
        {
            return email;
        }
        return null;
    }
}