/*
  @author   Alona Kashpruk
  @project   First Second Lessons
  @class  Palindrome
  @version  1.0.0
  @since 03.03.2021 - 18.34
*/

public class Palindrome {
    // ---
    // "psvm" for class to be usable - точка входа
    // in console to call: Palindrome /firstArgument/secondArgument/... - array of Strings
    public static void main(String[] args) {
        System.out.println("Hello palindrome");
        // Ctrl + Shift + ?  --- comment a couple lines of code

        int a = 2;
        int b = 3;
        System.out.println(a + b);
        double c = 6;
        System.out.println(a + c);
        char d = '5';
        char e = '9';
        // ASCII: to the code of num 5 ('53') we add the code of number, in a result have 110 - code of letter 'n'
        System.out.println(d + e); // 110
        String f = "5";
        String g = "9";
        System.out.println(f + g); // 59

        // casting - whe one type convert to another
        // casting int to char
        int h = 115;
        char l = (char) h;
        System.out.println(l); // s

        // casting int to String
        int j = 3482;
        String str = String.valueOf(j);
        System.out.println(str);
        // method length of String
        System.out.println(str.length()); // 4
        // casting String to int
        String str2 = "0065";
        int k = Integer.valueOf(str2);
        System.out.println(k); // 65

        // OPERATIONS: + - * /
        System.out.println(31 / 2); // 15
        System.out.println(31 % 2); // 1
        a = 5;
        b = 2;
        System.out.println( (double) a / 2);

        //logical AND, && - 'конъюнкция' 'conjunction'
        System.out.println((3 > 2) && (4 > 10));
        //logical OR, || - 'дизъюнкция' 'disjunction'
        System.out.println((3 > 2) || (4 > 10));
        // !=  ==
        System.out.println((b != 2) && (a == 5));
        //increment
        a++; // a = a + 1
        ++a;
        a+=1;
        System.out.println(a);

        // Check Palindrome (1st Method)
        String word1 = "1234321"; // Palindrome
        String word2 = "cat";
        // 'fori' layout for cycle
        for (int i = 35; i < 36; i++) {
            System.out.println(i + ". " + (char) i);
        }
        System.out.println(word1.length());
        boolean result = true;
        int length = word1.length();
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word1.charAt(length - 1 - i) ) {
                result = false;
                break;
            }
        }
        System.out.println(result);

        // Check Palindrome (2nd Method)
        word1 = "А муза – раба разума";
        word1 = word1.toLowerCase(); //make all letters lowercase
        word1 = word1.replaceAll(" ", ""); //substitute gap to no gap
        word1 = word1.replaceAll("\\.", ""); //if put only '.' all symbols and letters will be removed
        word1 = word1.replaceAll("-", ""); // different "-", need to copy exactly the "-" from word1
        StringBuilder builder = new StringBuilder(word1);
        String reversed = builder.reverse().toString();
        System.out.println(reversed);
        if (word1.equals(reversed)) {
            System.out.println(word1 + " is a palindrome.");
        } else {
            System.out.println(word1 + " is NOT a palindrome.");
        }
    }
}
