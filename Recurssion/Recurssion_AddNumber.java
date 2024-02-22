public class Recurssion_AddNumber {
    static int addNumber(int i){
        if(i==0) return 0;
        return i + addNumber(i-1);
    }
    public static void main(String args[]){
        System.out.println(addNumber(10));
    }
}
