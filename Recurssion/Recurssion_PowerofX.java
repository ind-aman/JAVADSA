public class Recurssion_PowerofX {
    private static int power(int x,int n){  //Stack height is N
        if(n==0 ) return 1;
        return x * power(x, n-1);
    }
      private static int powerlogN(int x,int n){  //Stack height is N
        if(n==0 ) return 1;
        return x * powerlogN(x, n/2)*powerlogN(x, (n-1)/2);
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 16;
        System.out.println(power(x,n));
        System.out.println(powerlogN(x, n));
    }

}
 