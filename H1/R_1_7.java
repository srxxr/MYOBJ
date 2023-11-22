package H1;
public class R_1_7 {
    public static void squares(int num){
        double sum=0;
        for (int i = 1; i <=num; i++) {
            double dnum=(double) i;
            double s=Math.pow(dnum,2);
            sum+=s;
        }
        System.out.println((int)sum);

    }

    public static void main(String[] args) {
        squares(4);
    }
}
