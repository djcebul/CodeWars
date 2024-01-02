/*Complete the function that accepts a string parameter,
and reverses each word in the string.
All spaces in the string should be retained.


Examples
"This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"*/

public class E6_ReverseWords {
    public static void main(String[] args) {
        //System.out.println(reverseWords("This is an example!"));
        String example1 = reverseWords("This is an example!");
        String example2 = reverseWords("double  spaces");

        System.out.println(example1); // Oczekiwane wyjście: "sihT si na !elpmaxe"
        System.out.println(example2); // Oczekiwane wyjście: "elbuod  secaps"

    }

//    public static String reverseWords(final String original)
//    {
//        var reverse = new StringBuilder();
//        var r = new StringBuilder();
//        String[] words = original.split("\\s+");
//        for (int i = 0; i < words.length; i++) {
//            r = new StringBuilder(words[i]).reverse();
//            if (i == words.length-1) reverse.append(r);
//            else reverse.append(r).append(" ");
//        }
//        return reverse.toString();

    public static String reverseWords(final String original)
    {
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;


        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }
}



