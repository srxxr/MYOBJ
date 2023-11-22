package H1;
import java.util.Scanner;
public class Q5_Q6 {
    static String element[]={"sara","sara1","faisal"};
    public static void main(String[] args) {
        display(element);
        input(element);
display(element);
    }
    public static void display(String array[]){
        for (String el: array)
            System.out.println(el);
        {

        }
    }
    public static void input(String array[]){
        Scanner name=new Scanner(System.in);
        System.out.println("enter the name");
        for (int i = 0; i <array.length ; i++) {
            array[i]= name.next();
        }}
}
