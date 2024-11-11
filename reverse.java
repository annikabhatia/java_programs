public class reverse {

    //need help with this

    public static String reversedString(String a) {
        if (a.length() == 0) {
            return a;
        }
        return a.charAt(a.length() - 1) + reversedString(a.substring(a.length() - 2));
    }
    public static void main(String[] args) {
        System.out.println(reversedString("hello"));
    }
}
