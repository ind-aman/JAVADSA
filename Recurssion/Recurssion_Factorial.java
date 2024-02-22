public class Recurssion_Factorial {
    static int fact(int i){
        if(i == 1) return 1;
        int a = fact(i-1);
        return i * a;
    }

    public static void main(String args[]){
        System.out.println(fact(5));
    }
}
