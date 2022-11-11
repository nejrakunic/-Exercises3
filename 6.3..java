import java.util.ArrayList;
import java.util.Scanner;

public class exercise6 {
public static void main(ArrayList<String> lists)
{
ArrayList<String> words = new ArrayList<String>();
Scanner reader = new Scanner(System.in);

String word;

int i = 0;
while(true)
{
word = reader.nextLine();
if(words.contains(word))
{
System.out.println("You have entered this word twice!");
break;
}
else
{
words.add(word);
}
}
}
}