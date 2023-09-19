import java.util.Random;
import java.util.Scanner;

public class Task_9 
{

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_-+=<>?/";

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter the desired complexity: ");
        int complexity = scanner.nextInt();
        
        String password = generatePassword(length, complexity);
        System.out.println("Generated Password: " + password);
    }
    
    public static String generatePassword(int length, int complexity) 
    {
        String characters = "";
        
        if (complexity >= 1) 
        {
            characters += LOWERCASE_CHARS;
        }
        
        if (complexity >= 2) 
        {
            characters += UPPERCASE_CHARS;
        }
        
        if (complexity >= 3) 
        {
            characters += NUMBERS;
        }
        
        if (complexity >= 4) 
        
        {
            characters += SPECIAL_CHARS;
        }
        
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        
        return password.toString();
    }
}
