public class Recurssion_Fibbonacci {
    static int fibbonacci(int n){
        if(n==0) return 0;
        var a = n + fibbonacci(n-1);
        System.out.println(a);
        return a;

    }
    public static void main(String[] args) {
        fibbonacci(10);
    }
}
