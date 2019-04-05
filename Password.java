
/**
 * A Password stores an encrypted password
 *
 * @author APCS@HB 
 * @version 2019-04
 */
public class Password
{
    private String storedPassword;
    
    public Password (String s)
    {
        storedPassword = s;      
    }
    
    public static String encrypt (String pw)
    {
        String ans = "";
        
        // builds an array of characters to encrypt a password
        // includes UPPERCASE, lowercase, digits, and many special characters
        char[] chars = new char[89];
        for (int i = 0; i <= 88; i++)
          chars[i] = (char)(35 + i);;
        
        // Convert the pw String to a new String and return it
        
        
        return ans;
    }
    
    public boolean isMatch (String pw)
    {
        // How do you determine whether the user entered
        // the correct password?
    }
    
}
