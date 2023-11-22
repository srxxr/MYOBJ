package H1;

public class R_1_6 {
    public static void SoutpositiveOddNUM(int num){
        int sum=0;
        for (int i = 1; i <=num; i++) {
            if (i%2!=0)
                sum+=i;
        }
        System.out.println(sum);

        }

    public static void main(String[] args) {
        SoutpositiveOddNUM(9);
    }
}
