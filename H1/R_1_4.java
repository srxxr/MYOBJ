package H1;
import java.util.Scanner;
public class R_1_4 {
    public static boolean IsEven(int x){
        boolean is_num_even=false;
        for (int i = 1; i < x; i++)
            is_num_even=!is_num_even;

        return is_num_even;
    }


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int Input = input.nextInt();
        boolean check = IsEven(Input);

        if (check == true)

            System.out.println(Input + " is even number");
         else if (check ==false)
            System.out.println(Input + " is not an even number");




}}
