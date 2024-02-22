public class Recurrssion_TowerOfHanoi {
    static int counter =0;
       static void TowerOfHanoi(int n , String S, String H, String D){
        counter++;
        if(n==1) {
            System.out.println("Move Disk From " + S + "To " + D);
            return;
        }

        TowerOfHanoi(n-1, S,D,H);
        System.out.println("Move Disk From "+ S + "To " + D);
        TowerOfHanoi(n-1, H, S, D);
       }

       public static void main(String[] args) {
        TowerOfHanoi(8, "Source", "Helper", "Destination");
        System.out.println(counter);
       }
}
