import java.util.Scanner;
public class scanner
{
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter username");
        String username=myobj.next();
        System.out.println("the username is"+username);
    }
}