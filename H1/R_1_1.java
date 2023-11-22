package H1;
import java.util.Scanner;
public class R_1_1 {
    public static void inputAllBaseTypes(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter an integer value:");
        while (!in.hasNextInt()){
            in.next();
            System.out.println("please enter valid integer value ");
        }
//        System.out.println("Enter a character value:");
//        char first = in.next().charAt(0);

        System.out.println("Enter a double value:");
        while (!in.hasNextDouble()){
            in.next();
            System.out.println("please enter valid double value ");

        }
        System.out.println("Enter a float value:");
        while (!in.hasNextFloat()){
            in.next();
            System.out.println("please enter valid float value ");
        }
        System.out.println("Enter a boolean value:");
        while (!in.hasNextBoolean()){
            in.next();
            System.out.println("please enter valid boolean value ");
        }
        System.out.println("Enter a long value:");
        while (!in.hasNextLong()){
            in.next();
            System.out.println("please enter valid long value ");
        }
        System.out.println("Enter a byte value:");
        while (!in.hasNextByte()){
            in.next();
            System.out.println("please enter valid byte value ");
        }
        System.out.println("Enter a short value:");
        while (!in.hasNextShort()){
            in.next();
            System.out.println("please enter valid short value ");
        }
        in.close();
    }

    public static void main(String[] args) {
        inputAllBaseTypes();
    }
}
