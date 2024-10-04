import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First word?");
        String s1;
        s1 = sc.nextLine();
        System.out.println("Second word?");
        String s2;
        s2 = sc.nextLine();
        System.out.println("Give a number:");
        int n = sc.nextInt();
        System.out.println(lastFirstN(s1, s2, n));

        stringManip("Elephant", "elephant");
    }

    public static String lastFirstN(String s1, String s2, int n)
    {
        String output = new String();
        String lastN = s1.substring(n-1);
        String firstN = s2.substring(0,n);

        output = lastN + firstN;
        return output;
    }

    public static void stringManip(String s1, String s2)
    {
        s1 = s1.toUpperCase();
        System.out.println(s1);

        String upS2 = s2.toUpperCase();
        String lowS2 = s2.toLowerCase();
        String firstLetter = upS2.substring(0, 1);
        String restLower = lowS2.substring(1);
        System.out.println(firstLetter + restLower);
    }
}
