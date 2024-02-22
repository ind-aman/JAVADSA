/**
 * Recurssion_FirstandLastOccurence
 */
public class Recurssion_FirstandLastOccurence {

    static int first = -1;
    static int last = -1;
    static void occurrenceCheck(String s, Character a, int i){
        if(s.charAt(0)==a){
            if (first ==-1) {
                first = i;
                last =i;
            }
            else {
                last = i;
            }
        }
        if(s.length() ==1 ) return;
        occurrenceCheck(s.substring(1, s.length()), a, i+1);
        return;
    }

    public static void main(String[] args) {
        occurrenceCheck("abaacdaefaah", 'a', 0);
        System.out.println("First Occurence "+ first + "\nLast Occurence is " + last);
    }
} 