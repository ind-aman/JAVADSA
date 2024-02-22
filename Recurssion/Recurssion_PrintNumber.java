public class Recurssion_PrintNumber{

    static void recurr(int i){
        System.out.println(i);
        recurr(i-1);
        
    }

    public static void main(String args[]){
        recurr(5);
    }
}