public class exercise1
{
public static double average(int number1, int number2, int number3, int number4)
{
double sum = (double)((number1 + number2 + number3 + number4) / 4.0);

return sum;
}

public static void main(String[] args)
{
double answer = average(4, 3, 6, 1);
System.out.println("average: " + answer);
}
}