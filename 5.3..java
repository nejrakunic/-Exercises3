import java.util.Scanner;

public class exercise5 {
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
String fw, sw;

System.out.println("Type the first word: ");
fw = reader.next();

System.out.println("Type the second word: ");
sw = reader.next();

if(fw.contains(sw))
{
System.out.println("The word '"+ sw +"' is found in the word '"+ fw +"'.");
}
else
{
System.out.println("The second word cannot be found in the first word!");
}
}
}