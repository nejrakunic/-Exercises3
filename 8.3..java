import java.util.Scanner;

public class exercise8 {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);

String word = reader.nextLine();
String reverse = "";

for (int i = word.length() - 1; i >= 0; i--) {
reverse += word.charAt(i);
}

if (reverse.equals(word)) {
System.out.println("It is palindrome");
} else {
System.out.println("It is palindrome");
}
}
}