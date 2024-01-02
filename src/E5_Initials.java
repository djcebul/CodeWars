public class E5_Initials {
    public static void main(String[] args) {
        System.out.println(abbrevName("Daniel Cebula"));
    }
    public static String abbrevName(String name) {
        String a, b;
        a = String.valueOf(name.charAt(0)).toUpperCase();
        b = String.valueOf(name.charAt((name.indexOf(" ")) + 1)).toUpperCase();

        return a + "." + b;
    }
}
