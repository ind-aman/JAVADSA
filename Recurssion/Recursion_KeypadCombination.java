import java.util.ArrayList;
import java.util.List;

public class Recursion_KeypadCombination {
    static ArrayList<String> kepad = new ArrayList<>(List.of("",".","abc", "def","ghi","jkl","mno", "pqrs", "tuv","wxyz"));
    static void reteriveCombinaton(String s, String num){
        int key = num.charAt(0) -48;
        int keyLength = kepad.get(key).length();

        for(int i=0; i< keyLength; i++){
        
            if(num.length()==1){
                System.out.println(s+kepad.get(key).charAt(i));
                continue;
            }
            reteriveCombinaton(s+kepad.get(key).charAt(i), num.substring(1,num.length()));
        }
        return;
    }
    public static void main(String[] args) {
        reteriveCombinaton("", "791");
    }
    
}
