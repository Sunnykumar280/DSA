public class Main{
    private static void toh(int n, int s, int aux, int des){

//base case
        if(n == 1){
            System.out.println(s + " -> " + des);
            return;
        }
//        n-1 plates ko source se aux pe le jao
        toh(n-1, s, des, aux);
//        move nth plates
        System.out.println(s + " -> " + des);
        toh(n-1, aux, s ,des);
    }
    public static void main(String[] args){
        int n = 4;
        toh(n, 1, 2, 3);

    }
}