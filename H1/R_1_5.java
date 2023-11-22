package H1;

public class R_1_5 {

    public static void SoutAllpositiveNUM(int num){
       int sum=0;
        for (int i = 1; i <=num; i++) {
            sum+=i;

        }
        System.out.println(sum);

    }



    public static void main(String[]args){

       SoutAllpositiveNUM(5);
    }

}
