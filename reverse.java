import java.util.*;
public class reverse
{
public static void main(String arg[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a string: ");
String a = s.nextLine();
int l = a.length();
char c[] = a.toCharArray();
String b = "";
for(int i = l-1; i>=0; i--)
{
String z = String.valueOf(c[i]);
b = b.concat(z);
}
System.out.println("Reversed string: "+b);
}
}