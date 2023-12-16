package H3;

public class R_3_18 {
    public static void main(String[] args) {
        int[] A =new int[11];
        A[0]=1;
        A[1]=2;
        A[2]=3;
        A[3]=4;
        A[4]=5;
        A[5]=6;


        for (int i=0;i<= A.length-1;i++){
            if(A[0]==A[i]){
                System.out.println("repeated!!"+A[i]);
            }
        }

    }
}
