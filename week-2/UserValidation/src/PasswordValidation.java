public class PasswordValidation implements Validator
{
    private boolean allowSpaces;
    private boolean requireSpecial;
    private boolean requireNumber;
    private boolean requireLowercase;
    private boolean requireUppercase;

    public PasswordValidation (boolean allowSpaces, boolean requireSpecial, boolean requireNumber, boolean requireLowercase, boolean requireUppercase)
    {
        this.allowSpaces = allowSpaces;
        this.requireSpecial = requireSpecial;
        this.requireNumber = requireNumber;
        this.requireLowercase = requireLowercase;
        this.requireUppercase = requireUppercase;
    }

    public boolean isAllowSpaces()
    {
        return this.allowSpaces;
    }

    public void setAllowSpaces(boolean allowSpaces)
    {
        this.allowSpaces = allowSpaces;
    }

    public boolean isRequireSpecial()
    {
        return this.requireSpecial;
    }

    public void setRequireSpecial(boolean requireSpecial)
    {
        this.requireSpecial = requireSpecial;
    }

    public boolean isRequireNumber()
    {
        return this.requireNumber;
    }

    public void setRequireNumber(boolean requireNumber)
    {
        this.requireNumber = requireNumber;
    }

    public boolean isRequireLowercase()
    {
        return this.requireLowercase;
    }

    public void setRequireLowercase(boolean requireLowercase)
    {
        this.requireLowercase = requireLowercase;
    }

    public boolean isRequireUppercase()
    {
        return this.requireUppercase;
    }

    public void setRequireUppercase(boolean requireUppercase)
    {
        this.requireUppercase = requireUppercase;
    }

    @Override
    public boolean validate(User user)
    {
        String pwd = user.getPassword();
        if (pwd == null)
        {
            return false;
        }

        if (!allowSpaces && pwd.contains(" "))
        {
            return false;
        }
        if (requireSpecial && pwd.chars().noneMatch(ch -> !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)))
        {
            return false;
        }
        if (requireNumber && !pwd.matches(".*[0-9].*"))
        {
            return false;
        }
        if (requireLowercase && !pwd.matches(".*[a-z].*"))
        {
            return false;
        }
        if (requireUppercase && !pwd.matches(".*[A-Z].*"))
        {
            return false;
        }

        return true;
    }
}