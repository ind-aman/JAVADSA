public class Recurrision_moveAllXtoEnd {

    public static int count =0;
    public static StringBuilder newString = new StringBuilder();
    public static void moveX(String S, Character c){
        if(S.charAt(0)== c){
            count++;
        }
        else{
            newString.append(S.charAt(0));
        }
        if (S.length() ==1) {
            for(int i=0; i<count; i++){
                newString.append(c);
            }
            return;
        }

        moveX(S.substring(1, S.length()), c);
    }

    public static void main(String[] args) {
        moveX("axbcxxd", 'x');
        System.out.println(newString.toString());
    }

}
