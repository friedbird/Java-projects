import java.util.Scanner;

public class codon_translator
{
    public static void main(String[] args)
    {

    Scanner scan = new Scanner(System.in);
    System.out.println("enter the codon sequence: ");
    String word = scan.nextLine().toUpperCase();
    String betterword = "";


    for (int i = 0; i < word.length(); i++)
    {
        if (word.substring(i, i + 1).equals("T"))
         betterword += ("A");

        if (word.substring(i, i + 1).equals("G"))
         betterword += ("C");

        if (word.substring(i, i + 1).equals("A"))
         betterword += ("U");

         if (word.substring(i, i + 1).equals("C"))
         betterword += ("G");

         if (word.substring(i, i + 1).equals(" "))
         betterword += (" ");

    }

    System.out.println(betterword);
    }
}