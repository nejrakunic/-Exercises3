import java.util.Scanner;

public class exercise2 {
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
String name;

System.out.println("Enter your name: ");
name = reader.nextLine();

System.out.println("Number of characters: " + name.length());
}
}