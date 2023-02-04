import java.util.*;
public class factorial
{
public static void main(String[] arg)
{
int num=6;
long factorial=multiplyNumbres(int num);
System.out.println("factorial of"+num+"="+factorial);
}
public static long multiplyNumbers(num)
{
if(num>=1)
return num*multiplyNumbers(num-1);
else
return 1;
}
}
