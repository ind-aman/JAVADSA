
// Important Question

public class Recursion_printAllSubsequenceOfString {
    static void getSubsequence(String s, int index, String newString){
        if(index == s.length()){
            System.out.println(newString);
            return;
        }
        char c = s.charAt(index);

        getSubsequence(s,index +1, newString+'X');
        getSubsequence(s, index + 1, newString+c);
    }

    public static void main(String[] args) {
        getSubsequence("abc", 0, "");
    }
}
