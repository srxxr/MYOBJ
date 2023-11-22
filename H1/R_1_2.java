package H1;

public class R_1_2 {
    public static void main(String args[])
    {
        int A[]={13,17,18,0,100,17};
        A[4]=550;
        int B[] = A.clone();
        for(int a:A)
            System.out.println(a);
        for(int b:B)
            System.out.println(b);
    }
}
