import java.util.ArrayList;

public class exercise7 {
public static ArrayList<Integer> lengths(ArrayList<String> list)
{
ArrayList<Integer> listLenght = new ArrayList<>();
for (String name : list)
{
listLenght.add(name.length());
}
return listLenght;
}

public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();
list.add("Hallo");
list.add("Moi");
list.add("Benvenuto!");
list.add("badger badger badger badger");
ArrayList<Integer> lengths = lengths(list);

System.out.println("The lengths of the Strings: " + lengths);
}
}