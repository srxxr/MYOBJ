package H2;

public class R_2_14 {
    static String array[]={"sara","faisal","ali","hh"};
    public static void ss(String array[]){
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Don’t try buffer overflow attacks in Java!");
    }
}

    public static void main(String[] args) {
        ss(array);
    }}

