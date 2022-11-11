import java.util.Scanner;

public class exercise4 {
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
String name;

System.out.println("Type your name: ");
name = reader.nextLine();

for(int i = name.length() - 1; i >= 0; i--)
{
System.out.println("In reverse order: " + name.charAt(i));
}
}
}