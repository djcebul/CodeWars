/*Complete the function that accepts a string parameter,
and reverses each word in the string.
All spaces in the string should be retained.


Examples
"This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"*/

public class E6_ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));

    }

    public static String reverseWords(final String original)
    {
        var reverse = new StringBuilder();
        var r = new StringBuilder();
        String[] words = original.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            r = new StringBuilder(words[i]).reverse();
            if (i == words.length-1) reverse.append(r);
            else reverse.append(r).append(" ");
        }
        return reverse.toString();
    }

}
