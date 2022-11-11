import java.util.Scanner;

public class exercise3 {
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
String name;

System.out.println("Type your name: ");
name = reader.nextLine();

for(int i = 0; i < name.length(); i++)
{
System.out.println((i + 1) + ". character: " + name.charAt(i));
}
}
}