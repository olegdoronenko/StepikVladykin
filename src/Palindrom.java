/*
урок Владыкина 2.3 - является ли строка палиндромом
 */
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your string: ");
        String sc = input.nextLine();
        System.out.println(isPalindrome(sc));
    }

//"[^a-zA-Z0-9]" регулярка в помощь
    public static boolean isPalindrome(String text) {
        //StringBuilder fistPart = text;
        //удалим с помощью регулярки все небуквы и нецифры
        text = text.replaceAll("[^a-zA-Z0-9]","");

        String text2 = new StringBuilder(text.substring((text.length()/2 + text.length()%2))).reverse().toString();

        System.out.println(text.substring(0, (text.length()/2)));
        System.out.println(text2);
        return text.substring(0, (text.length()/2)).toLowerCase().equals(text2.toLowerCase());
    }
}
