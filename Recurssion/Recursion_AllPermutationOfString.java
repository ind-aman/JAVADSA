import java.util.Arrays;

public class Recursion_AllPermutationOfString {

    //myWay 

    static int[] hashTable(String s){
        int[] _hashTable = new int[26];
        for(int i= 0; i<s.length(); i++){
            _hashTable[s.charAt(i)-97]++;
        }
        return _hashTable;
    }

    static void printAllPermutation(StringBuilder s, int[] arr){
        boolean flag = false;
        for(int i= 0; i< 26; i++){
            
            if(arr[i]>0){
                int[] localarr = Arrays.copyOf(arr, arr.length);
                flag = true;
                localarr[i]--;
                var x = new StringBuilder(s);
              
                printAllPermutation(x.append((char)(i+97)),localarr);
                
            }
        }
        if (!flag) {
            System.out.println(s);
        }

        
    }

    //Shardha khapra way
    static void printpermute(String inputStr, String permute){
        if(inputStr.length()==0) System.out.println(permute);
        for(int i=0; i< inputStr.length(); i++){
            char c = inputStr.charAt(i);
            
            printpermute(inputStr.substring(0, i)+ inputStr.substring(i+1), permute+c);
        }
    }

    public static void main(String[] args) {
       // StringBuilder s = new StringBuilder();
        //printAllPermutation(s, hashTable("aaab"));

        printpermute("abc", "");
    }
}
