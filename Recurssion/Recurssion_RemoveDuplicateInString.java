public class Recurssion_RemoveDuplicateInString {
   static  Integer[] hashTable = new Integer[26];
   static StringBuilder _string = new StringBuilder();
    static void removeDuplicate(String s){
        if(hashTable[s.charAt(0)-97] == null){
            _string.append(s.charAt(0));
            hashTable[s.charAt(0)-97] =1;
        }
        if (s.length() == 1) {
            return;
        }
        removeDuplicate(s.substring(1,s.length()));
    }

    public static void main(String[] args) {
        removeDuplicate("abbccda");
        System.out.println(_string);
    }
    
   
   
}
