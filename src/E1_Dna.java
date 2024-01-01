
/*Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

        "ATTGC" --> "TAACG"
        "GTAT" --> "CATA"*/

public class E1_Dna {
    public static void main(String[] args) {
        System.out.println(DnaStrand.makeComplement("TAACGB"));
    }
    public static class DnaStrand {


        public static String makeComplement(String dna) {
            StringBuilder dnaready = new StringBuilder();
            for (int i = 0; i < dna.length(); i++) {
                if (dna.charAt(i) == 'A') dnaready.append("T");
                if (dna.charAt(i) == 'T') dnaready.append("A");
                if (dna.charAt(i) == 'G') dnaready.append("C");
                if (dna.charAt(i) == 'C') dnaready.append("G");
            }
            return dnaready.toString();
        }
    }
}
