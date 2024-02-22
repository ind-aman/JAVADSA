public class Recurrsion_PrintinReverseString {
    public static void printReverseString(String s){
        if(s.length()  == 1) {
            System.out.print(s);
            return;
        }
        printReverseString(s.substring(1, s.length()));
        System.out.print(s.charAt(0));
        return;

    }

    public static void main(String[] args) {
        String s = "AmanKumar";
        printReverseString(s);
    }
}
